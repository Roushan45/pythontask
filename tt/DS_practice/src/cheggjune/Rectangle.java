package cheggjune;

public class Rectangle {
	//bottom-left and top-right corner of rectangle
	//with sides are parallel to axes
	private double blX, blY,trX,trY;
	
	public Rectangle(double x1, double y1, double x2, double y2) throws Exception {
		if(x1<x2 || y1<y2)
			throw new Exception("Invalid Co-ordinates");
		blX=x1;
		blY=y1;
		trX=x2;
		trY=y2;
	}
	
	//returns the area of rectangle
	public double area(){
		//calculating the area of rectangle
		return trX*trY;
	}
	
	//return true if point x,y inside the rectangle
	public boolean inside(double x, double y){
		//for fitting the x and y in rectangle
		//it  must have less in size with respectives sides
		return x<trX && y<trY;
	}

	//moves the top-right corner to form the largest square
	//thats fits inside the rectangle
	
	public void largetSquare(){
		//as per the above given trx and blx is parallel
		//so make it is square should have (trX=trY) or (blX=blY)
		//need to move 
		System.out.println("For forming the largest square :\n"
				+ "Need to move " +(trX-trY));
		System.out.println("Largest Square thats fit in Rectangle\n"
				+"Side of square will be : "+trY);
	}
}
