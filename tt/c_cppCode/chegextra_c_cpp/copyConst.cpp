#include<iostream>
using namespace std;
//class pairlist
class PairList
{
	public:
		//Normal constructor
		PairList(int i);
		//Copy constructor for deep copy of object
		PairList(const PairList &other);
		int getCopiedValue();
		//this is the value that we will initialize by normal constturctor
		//PLEASE note that i am here using int value you can choose 
		//any other value /object that you required
		int *value;
		//will do the deep copy of above value in this copiedValue by using 
		//copy constructor 
		int *copiedValue;
};
//Normal constuctor declaration
PairList::PairList(int i){
	value=new int;
	*value=i;
}
//copy constructor declaration	
PairList::PairList(const PairList &other){
	copiedValue = new int;
	//carefull see heredoing deep copy here by taking reference of value 
	//that is above initialize by normal constructor
	*copiedValue = *other.value;
}
 int PairList::getCopiedValue(){
 	return *copiedValue;
 }	
 //dispalying the cpied value
void display(PairList obj){
	cout<<"deep copy done by copy constructor copiedValue = "<<obj.getCopiedValue()<<endl;
}
//main starts here
int main()
{
	//created normal constructor here
	//notice that copy const also get invoked by compiler
	//giving initial value to 20 ans should same value 
	//copied to copiedValue by copy constructor
	PairList pairList(20);
	//displaying value
	display(pairList);
}

