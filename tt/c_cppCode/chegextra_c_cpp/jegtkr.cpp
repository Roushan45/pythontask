#include <iostream>
#include <cstdlib>
using namespace std;
class node
{
public:
int item; node* next;
    node(int x, node* t)
      { item = x; next = t; }
};
typedef node *link;
 
int main(int argc, char *argv[])
{ int i;// N = atoi(argv[1]), M = atoi(argv[2]);
int N=6;
int M = 5;
    link t = new node(1, 0); t->next = t;
    link x = t;
    for (i = 2; i <= N; i++)
      x = (x->next = new node(i, t));
    while (x != x->next)
      {
        for (i = 1; i < M; i++) x = x->next;
        x->next = x->next->next;
      }
    cout << x->item << endl;
}
