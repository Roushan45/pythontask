package cheggoct;

import java.util.Scanner;

public class HouseRenovate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double room_hieght,room_width,room_length;
		double door_width,door_hieght;
		double win1_width,win1_height;
		double win2_width,win2_height;
		double bookshelf_lenght,bookshelf_width,bookshelf_height;
		double painting_cost,carpenting_cost;
		
		System.out.print("Enter the Room hieght : ");
		room_hieght = sc.nextDouble();
		System.out.print("Enter the Room width : ");
		room_width = sc.nextDouble();
		System.out.print("Enter the Room length : ");
		room_length = sc.nextDouble();
		
		System.out.print("Enter the Door hieght : ");
		door_hieght = sc.nextDouble();
		System.out.print("Enter the Door width : ");
		door_width = sc.nextDouble();
		
		System.out.print("Enter the window 1 hieght : ");
		win1_height = sc.nextDouble();
		System.out.print("Enter the window 1 width : ");
		win1_width = sc.nextDouble();
		System.out.print("Enter the window 2 hieght : ");
		win2_height = sc.nextDouble();
		System.out.print("Enter the window 2 width : ");
		win2_width = sc.nextDouble();
		
		System.out.print("Enter the bookshelf hieght : ");
		bookshelf_height = sc.nextDouble();
		System.out.print("Enter the bookshelf width : ");
		bookshelf_width = sc.nextDouble();
		System.out.print("Enter the bookshelf length : ");
		bookshelf_lenght = sc.nextDouble();
		
		System.out.print("Enter the paiting cost per square feet: $");
		painting_cost = sc.nextDouble();
		System.out.print("Enter the carpenting cost per square feet: $");
		carpenting_cost = sc.nextDouble();
		//area of 4 walls
		double areaOfwalls = 4*(room_length*room_hieght);
		//area of door ,windows;
		double areaOfDoor = door_hieght*door_width;
		double areaOfWindows = (win1_height*win1_width)+(win2_height*win2_width);
		//area of floor
		double roomFloorArea = room_length*room_width;
		//area of bookshelf on wall
		double bookShelfWallArea = bookshelf_height*bookshelf_lenght;
		//area of bookshelf floor
		double bookShelfFloorArea = bookshelf_width*bookshelf_width;
		//finally area for painting and carpeting
		double areaForPainting = areaOfDoor+areaOfWindows+bookShelfWallArea;
		double areaForCarpenting = roomFloorArea-bookShelfFloorArea;
		
		System.out.println("Area of wall After removing the painting area : "+(areaOfwalls-areaForPainting));
		System.out.println("Area of floor after removing area of bookshelf : "+areaForCarpenting);
		
		System.out.println("Cost for painting : $"+(areaForPainting*painting_cost));
		System.out.println("Cost for painting : $"+(areaForCarpenting*carpenting_cost));
		
	}

}
