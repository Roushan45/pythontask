package cheggAugust;
import java.io.*;
import java.util.Scanner;
/*
   File Header
 */
class BangBoom{
	public static void main(String[] args) throws Exception{

		Scanner file = new Scanner(new File("D:/StarData.txt"));
		Star[] universe = new Star[42];

		for(int i = 0; i < universe.length; i++){
			if(!file.hasNextLine())break;
			String[] split = file.nextLine().split("\\|");
			double mag = Double.parseDouble(split[2]);
			universe[i] = new Star(split[0], split[1], mag);
		}
		//taken one start of collision
		Star star = universe[0];
		for(int i=1;i<40;i++)
		{
			//colliding the two start at time
			//and returning to star
			star = star.collide(universe[i]);
		}
		//priting the star object
		System.out.println(star);
	}
}