#include<string.h>
#include<stdio.h>
#include<iostream>
#include<string>
#include<sstream>
#include<fstream>

using namespace std;
/*person structure with name id and address*/
struct Person{
	char name[25];
	int id;
	char address[60];
};
//print method declaration
void print(Person p);
int main()
{
	//array of 20 person
	Person array[20];
	int count = 0;
	//file name to open
	char fileName[15] = "a1.txt";
	ifstream fin;
	string line;
	//opened file for read
	fin.open(fileName,ios::in);
	while(getline(fin,line))
	{
		string temp;
		stringstream ss(line);
		int i=0;
		//splitting string by ,
		while(getline(ss,temp,','))
		{
			//adding detail to array of Person struct
			if(i==0)
				strcpy(array[count].name,temp.c_str());
			if(i==1)
				array[count].id = stoi(temp);
			if(i==2)
				strcpy(array[count].address,temp.c_str());
			i++;
		}
		//increasing the count
		count++;
	}
	//closed the file
	fin.close();
	//sorting the array on the base of
	//ascending ID
	int i, j;
    Person temp;
    for (i = 0; i < count - 1; i++)
    {
        for (j = 0; j < (count - 1-i); j++)
        {
            if (array[j].id > array[j+1].id)
            {
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            } 
        }
    }
    cout<<"Printing the Person Information in ID Ascending order \n";
    //printing the person details with 
    //by calling print method
	for(int i=0;i<count;i++)
	{
		print(array[i]);
	}
	//writting to file for new Person
	string choice;
	ofstream fout;
	fout.open(fileName,std::ios_base::app);
	//it will add untill the user enter n
	while(1)
	{
		cout<<"Do you want to add More Person Y/N?: ";
		cin>>choice;
		if(choice=="Y"||choice=="y")
		{
			string n;
			int i;
			string add;
			cout<<"Person last Name and first name seprated by space : ";
			cin.ignore();
			getline(cin,n);
			cout<<"ENter Id :";
			cin.ignore();
			scanf("%d",&i);
			cout<<"Enter Address : ";
			cin.ignore();
			getline(cin,add);
			fout<<n<<","<<i<<","<<add<<"\n";
		}
		else{
			break;
		}
	}
	//searching for last name of people
	while(1)
	{
		cout<<"Search the people by last name Y/N: ";
		cin>>choice;
		char n[25];
		if(choice=="Y"||choice=="y")
		{
			cout<<"Enter the Person last name : ";
			scanf("%s",&n);
			for(int i=0;i<count;i++)
			{
				if (strstr(array[i].name, n) != NULL)
					{
						print(array[i]);
					}
			}
		}
		else{
			break;
		}
	}
	return 0;
}
void print(Person p)
{
	cout<<"Person Name : "<<p.name<<endl;
	cout<<"Person ID : "<<p.id<<endl;
	cout<<"Pesron Address : "<<p.address<<endl;
	cout<<"--------------------\n";
}
