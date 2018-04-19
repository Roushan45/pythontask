#include<iostream>
#include<string>
using namespace std;
//Player class
class Player{
	private:
		//variables
		string name;
		int points, rebounds, assists;
	public:
		//default constructor
		Player(){
			//initializing member data
			name="";
			points=-1;
			rebounds=-1;
			assists=-1;
		}
		//Param constructor
		Player(string n,int p,int r,int a){
			name=n;
			points=p;
			rebounds=r;
			assists=a;
		}
		//setters and getters
		string getPlayerName(){
			return name;
		}
		int getPoints(){
			return points;
		}
		int getRebounds(){
			return rebounds;
		}
		int getAssists(){
			return assists;
		}
		void setPoints(int p){
			points=p;
		}
		void setRebounds(int r){
			rebounds=r;
		}
		void setAssists(int a){
			assists=a;
		}
		//function for checking if caller object has more poinst than passed object
		bool hasMorePointsThan(Player p){
			return points>p.getPoints();
		}
};
//Team clas
class Team{
	private:
		//Five Playesr as given
		Player pointGuard;
		Player shootingGuard;
		Player smallForward;
		Player powerForward;
		Player center;
	public:
		//Constructor for initializing the players
		Team(Player p1,Player p2,Player p3,Player p4,Player p5){
			pointGuard=p1;
			shootingGuard=p2;
			smallForward=p3;
			powerForward=p4;
			center=p5;
		}
		//setters and getters
		void setPointGuard(Player p){
			pointGuard=p;
		}
		void setShootingGuard(Player p){
			shootingGuard=p;
		}
		void setSmallForward(Player p){
			smallForward=p;
		}
		void setPowerForward(Player p){
			powerForward=p;
		}
		void setCenter(Player p){
			center=p;
		}
		Player getPointGuard(){
			return pointGuard;
		}
		Player getShootingGuard(){
			return shootingGuard;
		}
		Player getSmallForward(){
			return smallForward;
		}
		Player getPowerForward(){
			return powerForward;
		}
		Player getCenter(){
			return center;
		}
		//method for calculating total points
		int totalPoint(){
			return (pointGuard.getPoints()+shootingGuard.getPoints()+powerForward.getPoints()+smallForward.getPoints()+center.getPoints());
		}
};
//Testing method for implementation of above points
int main(void){
	//created five player object
	Player center("Center",10,12,15);
	Player pg("Point_Guard",20,15,11);
	Player sg("shooting_guard",11,34,8);
	Player sf("small_forward",5,12,5);
	Player pf("Power_forward",31,3,5);
	
	//in c++ bool return 1 means true and 0 means false
	//comapring for points using 2 players
	cout<<"Point Guard has more point than power forward ? "<<pg.hasMorePointsThan(sg)<<endl;
	Team t1(pg,sg,sf,pg,center);
	//getting total points
	cout<<"Total points of team : "<<t1.totalPoint()<<endl;
	return 0;
	
}
