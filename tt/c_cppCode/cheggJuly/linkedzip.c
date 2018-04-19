#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAXCITYNAME 30
#define MAXLINELENGTH 50
typedef struct n_
{
   int zipCode; //A zip code that exists in the given city/state
   char* city; //Will point to a city name
   char state[3]; //A state abbreviation. Note that we need
                   //room for the NULL terminator!
   struct n_* left; //connections to other nodes
   struct n_* right;
} Node;
Node* importTree(char* filename);
Node* addNode(Node* root, Node* newNode);
int findStateCount(Node* root, char* state);
Node* findZipCode(Node* root, int zipCode);
void freeTree(Node* root);
int main(int argc, char** argv)
{
    // checking for proper arguments
   if(argc != 2) {
        printf("Usage: %s <filename>\n", argv[0]);
        exit(1);
    }

    // maintain the root of the tree
    Node* root = NULL;

    // read da file, make da tree
    root = importTree(argv[1]);

    if(root == NULL) {
        printf("\nFailed to import tree from file");
        exit(1);
    }

    int results = 0;
    int input = 0;
    int zipSearch = 0;
    Node* zipNode = NULL;
    char* stateSearch = malloc(sizeof(char)*3);


    // menu operation
    while(1) {
        printf("\n1: find number in a state");
        printf("\n2: find a ZIP code");
        printf("\n3: exit");
        printf("\n> ");

        scanf("%d", &input);

        switch(input) {
            case 1:
                printf("\nEnter the state you want to search for:");
                printf("\n> ");
                scanf("%s", stateSearch);

                // find number of results per state
                results = findStateCount(root, stateSearch);



                if(results == 0) {
                    printf("\nNo results found for that state code");
                } else {
                    printf("\nThe state has %d results in the sample", results);
                }

                break;
            case 2:
                // search for a ZIP code
                printf("\nEnter the ZIP you want to find:");
                printf("\n> ");
                scanf("%d", &zipSearch);

                // TODO: check the zipcode entered is 5 digits

                zipNode = findZipCode(root, zipSearch);

                if(zipNode == NULL) {
                    printf("\nNo results found for %d", zipSearch);
                } else {
                    printf("\nResult found for %d: ", zipSearch);
                    printf("\n     City: %s", zipNode->city);
                    printf("\n     State: %s", zipNode->state);
                }

                break;
            case 3:
                // quit
                freeTree(root);
                free(stateSearch);
                exit(0);
                break;
            default:
                printf("\nInvalid selection, choose again: ");
        }
    }

    // just in case we break out of our switch statement, make sure everything is free

    freeTree(root);
    free(stateSearch);
    return 0;
}
Node* addNode(Node* root, Node* newNode)
{
    // the new node shouldnt be null
    if(newNode == NULL) {
        printf("\nNULL pointer passed to addNode()");
        exit(1);
    }

    // if there is no tree, newnode starts the tree
    if(root == NULL) {
        return newNode;
    } else {
        // big zip codes on the right
        if(newNode->zipCode > root->zipCode) {
            root->right = addNode(root->right, newNode);
        }
        // lil zip codes on the left
        if(newNode->zipCode < root->zipCode) {
            root->left = addNode(root->left, newNode);
        }
    }

    return root;
}
int findStateCount(Node* root, char* state)
{
    // if the tree is empty, theres no instances of the state
    if(root == NULL) {
        return 0;
    } else {
        // this part increments our return if the state match
        // strcmp returns 0 if matching
        if(strcmp(root->state, state) == 0) {
            return 1 + findStateCount(root->left, state) + findStateCount(root->right, state);
        }

    }

    // traverse down the sides of the tree
    return findStateCount(root->left, state) + findStateCount(root->right, state);
}
Node* findZipCode(Node* root, int zip)
{
    if(root == NULL) {
        return NULL;
    } else {
        if(root->zipCode == zip) {
            return root;
        }

        Node* x = NULL;

        // test the left side
        x = findZipCode(root->left, zip);
        if(x != NULL) {
            return x;
        }

        // test the right side
        x = findZipCode(root->right, zip);
        if(x != NULL) {
            return x;
        }

    }

    // if nothing is found
    return NULL;
}
void freeTree(Node* root)
{
    if(root == NULL) {
        return;
    }

    freeTree(root->left);
    freeTree(root->right);
    // make sure to account for the city pointer
    free(root->city);
    free(root);
}
Node* importTree(char* filename)
{
    // we always want to maintain the root of the tree
   Node* root = NULL;

    // open up the text file
   FILE* fp = fopen(filename, "r");

    // if opening the file fails, break
   if(!fp)
   {
       printf("Error opening file.\n");
       return NULL;
   }
    // this loop continues until the file pointer reaches the EOF
   while(!feof(fp))
   {
        // creat a new node pointer, one for each iteration of the loop
        /* return type of malloc function is void* type so need to cast 
           in Node* struct type */
       Node* new = (Node*)malloc(sizeof(Node));
        // if the memory allocation fails, something went wrong or we're out of memory
       if(!new)
       {
           printf("Failed to allocate memory. Ending read.\n");
           exit(1);
       }

        // the city field inside the node struct is a pointer, so allocate memory
        // for that field
      new->city = malloc(sizeof(char)*MAXCITYNAME);
        // again, if memory allocation fails, something went wrong or we're out
       if(!(new->city))
       {
           printf("Failed to allocate memory. Ending read.\n");
           exit(1);
       }

        // set both children pointers of the new node to NULL (beacuse we haven't
        // read new children for this node yet. addNode() does that later
       new->left = NULL;
       new->right = NULL;

        // this is the 'buffer' that we're scanning the file into.
       char* line = malloc(sizeof(char)*MAXLINELENGTH);

        // guess what...if we can't malloc memory for the buffer, something is wrong
       if(!line)
       {
           printf("Failed to allocate memory. Ending read.\n");
           exit(1);
       }

        // if fgets() encounters an error, it returns null. this will occur at the
        // end of the file as well, but the next if statement accounts for that.
       if(fgets(line, MAXLINELENGTH, fp) == NULL)
       {
            // if fgets() returns null and it's not the end of the file, somethings
            // went wrong.
           if(!feof(fp))
           {
               printf("File reading ended prematurely. Check for errors in the file.\n");
               exit(1);
           }

            // either way, if fgets() fails (or we're at EOF), we don't have
            // anything to put in the pointers that we just allocated memory for,
            // so we need to free that up
           free(new->city);
           free(line);
           free(new);

            // close up our file.
           fclose(fp);
           break;
       }
        // temporary pointer will store the tokens that strtok finds.
       char* tmp = strtok(line, ",");
        // atoi convertts our char* to an integer which we can put in the node
       new->zipCode = atoi(tmp);

        // by calling strtok() with a NULL pointer, we advance to the next
        // token string
       tmp = strtok(NULL, ",");
        // we don't use assignment operators with strings, we use strcpy() to copy
        // into the memory
       strcpy(new->city, tmp);
        // since we're dealing with tokens, we need to append NULL terminator
        // characters to the city and state fields
       new->city[strlen(tmp)+1] = '\0';

        // advancing to the next token: the state field
        // the same process follows for the city field as for the state field for the
        // next 3 lines
       tmp = strtok(NULL, ",");
       strcpy(new->state, tmp);
       new->state[2] = '\0';

        // finally, once the node has been filled with the parsed info,
        // call addNode and stick it in our tree.
       root = addNode(root, new);

        // if the addNode() calls fail, root will still be NULL, and that's not right.
       if(!root)
       {
           printf("Root of tree is still NULL! Ending read.\n");
           exit(1);
       }

        // free up memory from our buffer
       free(line);
   }

    // once we've read the file and built the tree, return it.
   return root;
}

