#include<iostream>
#include<string>
#include<fstream>

using namespace std;
//base class documents
class Document
{
	private:
		//instance variable text
		string text;
	public:
		//constructors
		Document(string t){
			text=t;
		}
		Document(){
		}
		//setters and getters
		void setText(string t)
		{
			text=t;
		}
		string getText()
		{
			return text;
		}
		//print document function
		void printDocument()
		{
			cout<<text;
		}
		
};
//class email derived from document class
class Email : public Document
{
	//instance vriable
	private:
		string sender;
		string reciever;
		string title;
	public:
		//constructors
		Email(){
		}
		Email(string body)
		{
			setText(body);
		}
	
			//setters and getters for instance variable
		void setSender(string s)
		{
			sender=s;
		}
		void setTitle(string t)
		{
			title=t;
		}
		void setReciever(string r)
		{
			reciever=r;
		}
		string getTitle()
		{
			return title;
		}
		string getSender()
		{
			return sender;
		}
		string getReciever()
		{
			return reciever;
		}
		//print email methods
		void printEmail()
		{
			cout<<"Sender "<<sender<<endl;
			cout<<"Title "<<title<<endl;
			cout<<"Reciever "<<reciever<<endl;
			cout<<"Body "<<getText()<<"\n\n";
		}
};
//file class derived from document
class File : public Document
{
	private:
		string path;
		
	public:
		//constructors
		File(string filepath)
		{
			path=filepath;
		}
		File(){
		}
		void setPath(string p)
		{
			path=p;
		}
		//print file method
		void printFile()
		{
			ifstream fin;
			fin.open(path,ifstream::in);
			if(fin.bad())
			{
				cout<<"File not found";
				return;
			}
			string line;
			string data;
			while(getline(fin,line))
			{
				data=data+line;
			}
			setText(data);
			cout<<getText()<<"\n\n";
		}
};
//main method
int main()
{
	//created two object of email
	Email e1;
	Email e2("This is email2 body");
	//setting values
	e1.setText("this is email1 body");
	e1.setReciever("Receiver1");
	e1.setTitle("Title1");
	e1.setSender("sender1");
	e2.setReciever("Receiver2");
	e2.setTitle("Title2");
	e2.setSender("sender2");
	cout<<"email primting : \n";
	e1.printEmail();
	e2.printEmail();
	
	cout<<"file printing : \n";
	//created object of file
	File f1("file1.txt");
	File f2;
	f2.setPath("file2.txt");
	f1.printFile();
	f2.printFile();
	return 0;
}
