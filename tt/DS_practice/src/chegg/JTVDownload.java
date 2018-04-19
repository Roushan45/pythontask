package chegg;

import java.util.Scanner;

public class JTVDownload {
	static int load = 0;
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("\\t****************************************");
		System.out.println("\t*      Welcome to you JTV Show         *");
		System.out.println("\t****************************************");
		System.out.println("\n\tPlease Enter your response which you want to show \n");
		while(true){
			if(load>0){
				System.out.println("\nWait menu is loading........");
			Thread.sleep(5000);
			}
			System.out.println();
			System.out.println("\t***********************");
			System.out.println("\t* 1. Games of Thrones *");
			System.out.println("\t* 2. Sherlock homes   *");
			System.out.println("\t* 3. pigeon break     *");
			System.out.println("\t* 4. Enemy Scale      *");
			System.out.println("\t* 5. Dance Thrills    *");
			System.out.println("\t* 6. Exit             *");
			System.out.println("\t***********************");
			load++;
			int choice= sc.nextInt();
			switch(choice){
			case 1:System.out.println("Games of Thrones is TV based"
					+ "Thrilled show and backed on thrones of seven continents"
					+ "\nThere are till now seven series released"
					+ "\nEach season has 10 Episodes");break;
			case 2: System.out.println("Sherlock homes is detective TV serial"
					+ "Apart from that two movies also released "
					+ "\nif you have interst in mind thrilling then"
					+ "\nit is good show for you"
					+ "\nit is also season based TV show");break;
			case 3: System.out.println("pigeon break is TV based show"
					+ "And it also season based ."
					+ "\nit is one of the most lovely show "
					+ "\nall over the world");break;
			case 4: System.out.println("Enemy scale is old chinese based TV show"
					+ "It is famous all over the world for its good content"
					+ "\nLuxiorious life style and old tradition is main attraction "
					+ "\nof the show");break;
			case 5 : System.out.println("Dance Thrills is reality based TV show"
					+ "It is a comptetion show in which global"
					+ "\ncandidates competes to each over the "
					+ "\nGrand fianalle will be Broadcasted soon");break;
			case 6:System.exit(0);
			 default:System.out.println("\nWrong input please input valid response");
			
			}
			System.out.println("\n\tDo you want to show menu again");
			System.out.println("\n\t 1. Continue\n\t 2.Exit");
			int anotherChoice = sc.nextInt();
			if(anotherChoice==2){
				System.exit(0);
			}
			
		}
		
	}
}

