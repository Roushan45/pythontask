#include<iostream>
#include <fstream>
#include <cstdlib>
#include <stack>
using namespace std;
void display(stack<int> s);
stack<int> sortStack(stack<int> s);

int main()
{
	ifstream infile;
stack<int> sorted;
stack<int> s;
int array[20];
int i=0;
char cNum[10] ;
				//opening the file
                infile.open ("stacj.txt", ifstream::in);
                if (infile.is_open())
                {
                        while (infile.good())
                        {
                                infile.getline(cNum, 256, ',');
                                s.push(atoi(cNum));
                                array[i]= atoi(cNum) ;
                                i++ ;
                        }
                        infile.close();
                }
                else
                {
                        cout << "Error opening file";
                }
                
				cout<<"Before sorting stack \n\n";
				display(s);
				cout<<'\n';
				cout<<"\nsorting stack....\n\n";
				//coping the sorting stack value to sorted stack
				sorted=	sortStack(s);
				//printing the sorted stack value
				display(sorted);

	return 0;
}
//this method will print the value of stack
void display(stack<int> s)
{
	 for (stack<int> dump = s; !dump.empty(); dump.pop())
        cout << dump.top() <<"  ";
}

//this method will short the stack return the sorted stack
stack<int> sortStack(stack<int> s)
{
	//declared the temp stack
	stack<int> sorted;
	
	int i=0;
	int a=0;
	//declared the array of stack size that will store the value and use for sorting
	int sortArray[s.size()];
	for (stack<int> dump = s; !dump.empty(); dump.pop())
	{
		sortArray[i]=dump.top();
		i++;
        
	}
	//here sorting the array
	for (int i = 0; i < s.size(); ++i)
    {
        for (int j = i + 1; j < s.size(); ++j)
        {
            if (sortArray[i] < sortArray[j])
            {
                a =  sortArray[i];
                sortArray[i] = sortArray[j];
                sortArray[j] = a;
            }
        }
    }
	//after sorting the array pusing the array value to stack
	for(int i=0;i<s.size();i++){
	
		sorted.push(sortArray[i]);
	}
		//returning the sorted array
    return sorted;
}
