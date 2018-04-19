#include<cctype>
#include<iostream>
using namespace std;

int main()
{
char usr_input;
while(1){
    cout<<"Please enter lower case letter : ";
    /*storing the user input*/
    cin>>usr_input;
    /*if input is lower and are vowels*/
    if(islower(usr_input)&&usr_input=='a'||usr_input=='e'||usr_input=='i'||usr_input=='o'||usr_input=='u')
    {
        cout<<"You’ve entered a vowel letter '" <<usr_input<<"'."<<endl;
    }
    /*if input is lower and */
    else if(islower(usr_input))
    {
    	/*verfying different scenarios*/
        if(usr_input>'u'||usr_input<'a')
        {
            cout<<"You’ve entered a Non-vowel letter '"<<usr_input<<"'."<<endl;
        }
        else if(usr_input>'a'&&usr_input<'e')
        {
            cout<<"You’ve entered a Non-vowel letter '"<<usr_input<<"'."<<endl;
            cout<<"The first vowel letter after ‘"<<usr_input<<"' is ‘e’."<<endl;
        }
        else if(usr_input>'e'&&usr_input<'i')
        {
            cout<<"You’ve entered a Non-vowel letter '"<<usr_input<<"'."<<endl;
            cout<<"The first vowel letter after ‘"<<usr_input<<"' is ‘i’."<<endl;
        }
        else if(usr_input>'i'&&usr_input<'o')
        {
            cout<<"You’ve entered a Non-vowel letter '"<<usr_input<<"'."<<endl;
            cout<<"The first vowel letter after ‘"<<usr_input<<"' is ‘o’."<<endl;
        }
        else if(usr_input>'o'&&usr_input<'u')
        {
            cout<<"You’ve entered a Non-vowel letter '"<<usr_input<<"'."<<endl;
            cout<<"The first vowel letter after ‘"<<usr_input<<"' is ‘u’."<<endl;
        }
    }
    /*if input is not in lower*/
    else{
        cout<<"I’ll only take a lower case letter."<<endl;
    }
    }
    return 0;
}

