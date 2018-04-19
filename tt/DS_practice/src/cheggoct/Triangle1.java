package cheggoct;

public class Triangle1 {

	//Private memebrs of Traingle
	private double side1,side2,side3;
	protected static int j=9;
	/**
	 * Constructore
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public Triangle1(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		//using method if valid or not
		if(isTraingle())
		{
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		else{//if not valid
			this.side1 = 1d;
			this.side2 = 1d;
			this.side3 = 1d;
		}
	}
	//getters for sides fo traingle
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	/**
	 * Method for checking if valid triangle or not
	 * @return
	 */
	private boolean isTraingle()
	{
		if(this.side1<=1||this.side2<=1||this.side3<=1)
			return false;
		return true;
	}
	//method of checking Equilateral triangle or not
	public boolean isEquilateral() {
		//for equalateral all sides should have equal
		return this.side1==this.side2&& this.side1==this.side3;
	}

	//method for finding the right traingle
	public boolean isRight() {
		//there is rule for right angle tringle
		//square of longest side eaualt to sum of squares of other sides
		if(this.side1>this.side2&&this.side1>this.side3)
			return this.side1*this.side1 == (this.side2*this.side2)+(this.side3*this.side3);
		else if(this.side2>this.side1&&this.side2>this.side3)
			return this.side2*this.side2 == (this.side1*this.side1)+(this.side3*this.side3);
		return this.side3*this.side3 == (this.side2*this.side2)+(this.side1*this.side1);
	}


}
