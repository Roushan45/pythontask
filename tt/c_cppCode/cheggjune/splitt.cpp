#include<iostream>
#include<string>
#include<sstream>
#include<vector>
using namespace std;

int main()
{
	//declared the given string
	string inputString1 = " [{Oh what a loon() I am! Don't you agree?}] ";
	string inputString2 = " [I'll sing \"Amazing Grace\" for $5. ";
	string inputString3 = " Please call1 the #867-5309.] ";
	
	string line;
	//using stringstream will split the string
	stringstream ss1(inputString1);
	stringstream ss2(inputString2);
	stringstream ss3(inputString3);
	vector<string>::iterator it; 
	//splitting the string by white spaces
	cout<<"Splitting the string by white spaces \n";
	while(getline(ss1,line,' '))
	{
		cout<<line<<endl;
	}
	
	//splitting the string using punctuation(',"!?)
	cout<<"\nSplitting the string by punctuation marks \n";
	//takes a temp vector for pusing the elements
	vector<string> v;
	while(std::getline(ss2, line)) 
{
    std::size_t previous = 0, pos;
    //if u want to add more punctuation simply add in below find_first_of method
    while ((pos = line.find_first_of("?.,';!\" ", previous)) != std::string::npos)
    {
        if (pos > previous)
        //adding the string to vector
            v.push_back(line.substr(previous, pos-previous));
        previous = pos+1;
       
    }
    if (previous < line.length())
        v.push_back(line.substr(previous, std::string::npos));
}
//iterating through the vector
int i=0;
for(it=v.begin() ; it < v.end(); it++,i++ ) {
    // found nth element..print and break.
    cout<<*it<<"\n";
}

//splitting the string by symbols(@#$%&~)
cout<<"\nSplitting the string by symbols \n";
//same as above if u want add more symbols simply add in 
//find_first_of() method below
vector<string> v1;
	while(std::getline(ss3, line)) 
{
    std::size_t previous = 0, pos;
    while ((pos = line.find_first_of("#@$&~", previous)) != std::string::npos)
    {
        if (pos > previous)
            v1.push_back(line.substr(previous, pos-previous));
        previous = pos+1;
       
    }
    if (previous < line.length())
        v1.push_back(line.substr(previous, std::string::npos));
}
//printing the splitted values
for(it=v1.begin() ; it < v1.end(); it++,i++ ) {
    
    cout<<*it<<"\n";
}
//splitting the string by bock markers({})
cout<<"\nSplitting the string by block markers \n";
vector<string>v2;
stringstream ss4(inputString1);
	while(std::getline(ss4, line)) 
{
    std::size_t previous = 0, pos;
    while ((pos = line.find_first_of("{}", previous)) != std::string::npos)
    {
        if (pos > previous)
            v2.push_back(line.substr(previous, pos-previous));
        previous = pos+1;
       
    }
    if (previous < line.length())
        v2.push_back(line.substr(previous, std::string::npos));
}
for(it=v2.begin() ; it < v2.end(); it++,i++ ) {
    
    cout<<*it<<"\n";
}
}
