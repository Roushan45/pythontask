#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <string.h>

#define MAXLEN 9

typedef struct node_t{
   char *word;
   struct node_t *left, *right;
} node_t;

node_t *insert(struct node_t *head, char *word)
{
	if (head == null) return create_node(word);

if(strcmp(head->word, word) > 0)
{

    if(head->left == NULL)
    {
        head->left = create_node(word);
    }
    else
    {
        head->left = insert(head->left, word);
    }
}

else
{
    if(head->right == NULL)
    {
        head->right = create_node(word);
    }
    else
    {
        head->right = insert(head->right, word);
    }
}

return head;

}
int main()
{
    struct node *p_root = NULL;
    char *value;
     insert(value,  &p_root, (Compare)CmpStr);
return 0;
}
