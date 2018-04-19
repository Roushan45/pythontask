#include <iostream>
using namespace std;
int main()
{
	//declared variable requied
    int m,n,noOfrows;
    //it will store the the character
    char character;
    cout<<"Enter the triagle hieght: ";
    cin>>noOfrows;
    cout <<"Enter the character : " ;
    cin>>character;
    cout<<"\n";
    for(m=1;m<=noOfrows;++m)
    {
        for(n=1;n<=m;++n)
        {
        	//see here printing a space after character
           cout<<character<<" ";
        }
        cout<<"\n";
    }
    return 0;
}
