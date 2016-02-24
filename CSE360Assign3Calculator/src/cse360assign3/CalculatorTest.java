package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

//This JUNIT test ensures that the methods of Calculator.java are working correctly.
public class CalculatorTest 
{

	@Test
	public void testConstructor() 
	{
		//Ensure that Constructor creates an object that is not null.
		Calculator newCalculator = new Calculator();
		
		assertNotNull(newCalculator);
	}

	@Test
	public void testGetTotal() 
	{
		//Test to make sure total is zero as default
		Calculator newCalculator = new Calculator();
		
		assertEquals(0,newCalculator.getTotal());
	}
	
	@Test
	public void testAddition() 
	{
		
		//Test Addition Operations
		Calculator newCalculator = new Calculator();
		assertEquals(0,newCalculator.getTotal());
		
		newCalculator.add(5);
		assertEquals(5,newCalculator.getTotal());
		
		newCalculator.add(5);
		assertEquals(10,newCalculator.getTotal());
		
		newCalculator.add(-10);
		assertEquals(0,newCalculator.getTotal());
		
		newCalculator.add(-100);
		assertEquals(-100,newCalculator.getTotal());
		
		newCalculator.add(350);
		assertEquals(250,newCalculator.getTotal());
		
		//Check add zero
		newCalculator.add(0);
		assertEquals(250,newCalculator.getTotal());
		
	}
	
	@Test
	public void testSubtraction() 
	{
		
		//Test Subtraction Operations
		Calculator newCalculator = new Calculator();
		assertEquals(0,newCalculator.getTotal());
		
		newCalculator.subtract(5);
		assertEquals(-5,newCalculator.getTotal());
		
		newCalculator.subtract(-5);
		assertEquals(0,newCalculator.getTotal());
		
		newCalculator.subtract(-70);
		assertEquals(70,newCalculator.getTotal());
		
		newCalculator.subtract(35);
		assertEquals(35,newCalculator.getTotal());
		
		newCalculator.subtract(35);
		assertEquals(0,newCalculator.getTotal());
		
		newCalculator.subtract(20);
		assertEquals(-20,newCalculator.getTotal());
		
		newCalculator.subtract(0);
		assertEquals(-20,newCalculator.getTotal());
	}
	
	@Test
	public void testMultiplication() 
	{
		
		//Test Multiplication Operations
		Calculator newCalculator = new Calculator();
		assertEquals(0,newCalculator.getTotal());
				
		newCalculator.multiply(5);
		assertEquals(0,newCalculator.getTotal());
		
		newCalculator.add(2);
		assertEquals(2,newCalculator.getTotal());
		
		newCalculator.multiply(2);
		assertEquals(4,newCalculator.getTotal());
		
		newCalculator.multiply(2);
		assertEquals(8,newCalculator.getTotal());
		
		newCalculator.multiply(2);
		assertEquals(16,newCalculator.getTotal());
		
		newCalculator.multiply(2);
		assertEquals(32,newCalculator.getTotal());
		
		newCalculator.multiply(2);
		assertEquals(64,newCalculator.getTotal());
		
		newCalculator.multiply(1);
		assertEquals(64,newCalculator.getTotal());
		
		newCalculator.multiply(100);
		assertEquals(6400,newCalculator.getTotal());
		
		newCalculator.multiply(0);
		assertEquals(0,newCalculator.getTotal());
	}
	
	@Test
	public void testDivision() 
	{
		
		//Test Multiplication Operations
		Calculator newCalculator = new Calculator();
		assertEquals(0,newCalculator.getTotal());
		
		newCalculator.divide(5);
		assertEquals(0,newCalculator.getTotal());
		
		newCalculator.add(10);
		assertEquals(10,newCalculator.getTotal());
		
		newCalculator.divide(5);
		assertEquals(2,newCalculator.getTotal());
		
		newCalculator.divide(2);
		assertEquals(1,newCalculator.getTotal());
		
		newCalculator.divide(1);
		assertEquals(1,newCalculator.getTotal());
		
		//Test Special Case, Divide by zero will return zero
		newCalculator.divide(0);
		assertEquals(0,newCalculator.getTotal());
		
		//Test integer division logic, no remainder
		newCalculator.add(40);
		newCalculator.divide(30);
		assertEquals(1,newCalculator.getTotal());
		
	}
	
	@Test
	public void testGetHistory() 
	{
		fail("Not yet implemented");
		
		//Test Multiplication Operations
		Calculator newCalculator = new Calculator();
		assertEquals(0,newCalculator.getTotal());
		
		newCalculator.add(5);
		newCalculator.subtract(3);
		newCalculator.multiply(20);
		newCalculator.divide(10);
		
		assertEquals(4,newCalculator.getTotal());
		assertEquals("+ 5 - 3 * 20 / 10",newCalculator.getHistory());
		
		
	}
}
