package bw;
//Driver class for testing functionality
public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackJack_hand hand = new BlackJack_hand();
		//cards created
		BlackJack_hand card2 = new BlackJack_hand();
		BlackJack_hand card3 = new BlackJack_hand();
		BlackJack_hand card4 = new BlackJack_hand();
		//adding card to hand[]
		hand.addCard(card3);
		hand.addCard(card2);
		hand.addCard(card4);
		//printing the score
		System.out.println("Current score   "+hand.getScore()+"\n");
		//resetting the array
		hand.resetHand();
		//again printing the score
		System.out.println("\nhand after resetting "+hand.getScore());
			}

}
