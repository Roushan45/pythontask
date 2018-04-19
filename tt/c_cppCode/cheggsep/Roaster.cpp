#include<vector>
#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	//two vectors for storing no and rating
	vector<int> players_jersey_no;
	vector<int> players_rating;
	int jersey_no,rating;
	//asking initially 5 entries
	for(int i=0;i<5;i++)
	{
		cout<<"Enter player "<<i+1<<"'s jersey number : " ;
		cin>>jersey_no;
		cout<<"Enter player "<<i+1<<"'s rating : ";
		cin>>rating;
		players_jersey_no.push_back(jersey_no);
		players_rating.push_back(rating);
	}
	int j=0;
	//printing the data
	for (auto i1 = begin(players_jersey_no), i2 = begin(players_rating), e = end(players_jersey_no); i1 != e; ++i1, ++i2)
	
		{
 				cout<<"Player "<<++j<<"--jersery Number : "<<*i1<<" , Rating : "<<*i2<<endl;
		}
		//added a menu loop for performing operations
	while(1)
	{
		char choice;
		cout<<"MENU"<<endl;
		cout<<"a - Add player\nd - Remove player\nu - Update player rating\n"<<
		"r - Output players above a rating\no - Output roster\nq - Quit"<<endl;
		cout<<"Choose an option: ";
		cin>>choice;
		//using switch case
		switch(choice)
		{
			case 'a':{
				cout<<"Enter new player's jersey no : ";
				cin>>jersey_no;
				cout<<"Enter new palyer's rating : ";
				cin>>rating;
				players_jersey_no.push_back(jersey_no);
				players_rating.push_back(rating);
				break;
			}
			case 'u':{
				cout<<"Enter a jersey number : ";
				cin>>jersey_no;
				ptrdiff_t pos = distance(players_jersey_no.begin(), find(players_jersey_no.begin(), players_jersey_no.end(), jersey_no));
				if(pos >= players_jersey_no.size()) {
   				 cout<<"not found";
				}						 
				else
					{
						cout<<"enter the new rating for player : ";
						cin>>rating;
						players_rating[pos]=rating;
				}
				break;
			}
			case 'd':{
				cout<<"Enter player jersey number : ";
				cin>>jersey_no;
				ptrdiff_t pos = distance(players_jersey_no.begin(), find(players_jersey_no.begin(), players_jersey_no.end(), jersey_no));
				players_jersey_no.erase(players_jersey_no.begin()+pos);
				players_rating.erase(players_rating.begin()+pos);
				break;
			}
			case 'r':{
				cout<<"Enter a rating : ";
				cin>>rating;
				int i=0;
				for (auto i1 = begin(players_jersey_no), i2 = begin(players_rating), e = end(players_jersey_no); i1 != e; ++i1, ++i2)
						{
							if(*i2>rating)
  								cout<<"Player "<<++i<<"--jersery Number : "<<*i1<<" , Rating : "<<*i2<<endl;
						}
				break;
			}
			case 'o':{
				int i=0;
				for (auto i1 = begin(players_jersey_no), i2 = begin(players_rating), e = end(players_jersey_no); i1 != e; ++i1, ++i2)
					{
 						cout<<"Player "<<++i<<"--jersery Number : "<<*i1<<" , Rating : "<<*i2<<endl;
					}
				break;
			}
			case 'q':{
				exit(0);
				break;
			}
			default :{
				cout<<"Invalid option!"<<endl;
				break;
			}
		}
	}
	return 0;
}
