package cheggoct;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GeometricObjectTest {

	ArrayList<GeometricObject> objectList = new ArrayList<>();
	@Before
	public void createObject()
	{
		GeometricObject circle = new Circle();
		((Circle) circle).setRadius(5);
		objectList.add(circle);
		GeometricObject triangle = new Triangle(5, 8, 9);
		objectList.add(triangle);
		GeometricObject rectangle = new Rectangle();
		((Rectangle) rectangle).setHeight(10);
		((Rectangle) rectangle).setWidth(20);
		objectList.add(rectangle);
	}
	
	@Test
	public void circleTest()
	{
		//assertEquals(((Circle) objectList).getArea(), 3.14*5*5);
	}
}
