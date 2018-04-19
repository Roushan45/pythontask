#include<iostream>
#include<queue>
using namespace std;
//declared the method signature of queue  int type
queue<int> joinQueuesSeq(const queue<int>& q1,const queue<int>& q2);
//method implementation
queue<int> joinQueuesSeq(const queue<int>& q1,const queue<int>& q2)
{

	//copying the q1 and q2 to temp queue
	queue<int> temp1;
	temp1=q1;
	queue<int> temp2;
	temp2=q2;
	//declared and queue which will hold both 
	//queue  elements
	queue<int> merge;
	//emptying the temp1/q1
	while(!temp1.empty())
	{
		//adding to the merge
		merge.push(temp1.front());
		temp1.pop();
	}
		//emptying the temp2/q2
	while(!temp2.empty())
	{
		//adding to the merge
		merge.push(temp2.front());
		temp2.pop();
	}
	//returnin the merged queue
	return merge;
}
int main()
{
	
	queue<int> q1;
	queue<int> q2;
	queue<int> merge;
	//adding some values to q1
	q1.push(23);
	q1.push(24);
	q1.push(25);
	//adding some values to q2
    q2.push(56);
    q2.push(57);
    q2.push(58);
    cout<<"q1 element {23,24,25}"<<endl;
    cout<<"q1 element {56,57,58}"<<endl;
    cout<<"Merging ...\n\n";
    cout<<"after merged\n";
    merge=joinQueuesSeq(q1,q2);
    while(!merge.empty())
    {
    	cout<<merge.front()<<"  ";
    	merge.pop();
	}
	return 0;
}
//method implementation

