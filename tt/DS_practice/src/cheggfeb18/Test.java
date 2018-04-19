package cheggfeb18;
class Test {
	public static void main(String[] args) {
		GeometricObject gObjectArray [] = new GeometricObject [4];
		//created object of triangle and circle
		gObjectArray[0] = new Triangle(9,5,7);
		gObjectArray[1]=new Triangle();
		gObjectArray[2]=new Circle();
		gObjectArray[3]=new Circle(2,4,7);
		
		//using loop calling the below print method
		for(int i=0;i<gObjectArray.length;i++) {
			System.out.println(gObjectArray[i]);
			printAreaAndPerimeter(gObjectArray[i]);
		}

	}
	//completed the method for printing area and perimeter
	private static void printAreaAndPerimeter(GeometricObject gObject) {
		System.out.println("Area : "+gObject.getArea());
		System.out.println("Perimeter : "+gObject.getPerimeter());
		System.out.println();
	}
}