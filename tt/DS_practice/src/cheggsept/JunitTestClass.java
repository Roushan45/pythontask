package cheggsept;

import org.junit.Assert;
import org.junit.Test;
public class JunitTestClass {

	Bibliography bg = new Bibliography();
	
	/**
	 * this is test method for verifying the 
	 * initial capacity it should be 10
	 */
	@Test
	public void testInitialCapacity()
	{
		//initial size if bibliography will be 10
		Assert.assertEquals(bg.capacity(),10);
	}
	
	/**
	 * this is test method for checking the size after
	 * adding publications 
	 */
	@Test
	public void testSize()
	{
		//after adding two publications size should be 2
		Publication _1 = new Publication("Dennis R", "C Programming", "Texas", "Pearson", 1999);
		Publication _2 = new Publication("S dave", "R Programming", "N Y", "Pearson", 2005);
		bg.add(_1);
		bg.add(_2);
		Assert.assertEquals(bg.size(),2);
	}
	/**
	 * this is test method for checking the add function
	 * it should return true after adding a publication
	 */
	@Test
	public void verifyAdd()
	{
		Publication _3 = new Publication("john", "Life live", "N Y", "Universal", 2005);
		Assert.assertEquals(bg.add(_3),true);
	}
	/**
	 * this is test method for checking if resize method working fine
	 * as per the implementation after reaching the max capacity 
	 * it will resize to twice so initial size is 10 after adding more than ten
	 * it should be 20
	 */
	@Test
	public void testResize()
	{
		Publication _3 = new Publication("S dave", "R Programming", "N Y", "Pearson", 2005);
		//in loop added 11 
		for(int i = 0;i<11;i++)
		{
			bg.add(_3);
		}
		Assert.assertEquals(bg.capacity(),20);
		
	}
	/**
	 * this is test method for checking after deleting the publications
	 * size of array should get increased one at go
	 */
	@Test
	public void verifyDelete()
	{
		//getting the current size
		int i=bg.size();
		//deleting one
		bg.deleteLast();
		//verifying size
		Assert.assertEquals(bg.size(),i-1);
	}
}
