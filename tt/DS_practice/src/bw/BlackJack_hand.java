package bw;
//here is class  BlackJack Hand
public class BlackJack_hand {
	//Hand of max 11 card can contain
	private BlackJack_hand hand []=new BlackJack_hand[11];
	//int numCards that will keep track the no o card added to hand
	private static int numCards=0;
	
	//private constructor that will create card
	public BlackJack_hand(){
		
	}
	//getscore method that wil returm the score
	//here in your problem statement you havent define the what score should actually
	//containg so here returning just no of cars added to hand array
	public int getScore(){
		return numCards;
	}
	
	// this method will add card to hand array
	//
	public void addCard(BlackJack_hand card){
		//According to your problem statement hand should contain only 11 card
		//so before adding card to array checking the till now how many cards added 
		//if it is less than 11 then only go to if statement 
		if(numCards<=11){
			for(int i=0;i<this.hand.length;i++){
				//As u might know that whenever you initialize an array of object
				//it will intialize all index value to null
				//so before adding card to hand array just checking the null containg index 
				//and simply adding the card
				if(hand[i]==null){
					hand[i]=card;
					//after adding card just increasing the numCards value
					numCards++;
					break;
				}
			}
		}
	}
	//this method will reset the hand to null
	public void resetHand(){
		//Iterating through all index of hand and setting to null
		for(int i=0;i<this.hand.length;i++){
			hand[i]=null;
		}
		//and finally setting numCards value to 0;
		numCards=0;
		System.out.println("Hand resetted");
	}
	//simply returning hand to tostring format
	
	public String toString(){
		return hand.toString();
	}

}
