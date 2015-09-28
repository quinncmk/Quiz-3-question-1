

import static org.junit.Assert.*;

import org.junit.Test;

import MainPackage.Triangle;

public class TriangleTest {

	@Test
	public void test() {
		// To create an instance of Triangle class
		Triangle triangleTest1 = new Triangle(2, 3, 4);
		assertTrue("Triangle test1 of getArea() works", triangleTest1.getArea() == 2.9047375096555625);
		assertFalse("Triangle test1 of getArea() doesn't work", triangleTest1.getArea() == 1.2345678);
		assertTrue("Triangle test1 of getPerimeter() works", triangleTest1.getPerimeter() == 9.0);
		assertFalse("Triangle test1 of getPerimeter() doesn't work", triangleTest1.getPerimeter() == 8);
		
		// To create an instance of Triangle class
		Triangle triangleTest2 = new Triangle(4.5, 5.8, 4.2);
		assertTrue("Triangle test2 of getArea() works", triangleTest2.getArea() == 9.390079539066749);
		assertFalse("Triangle test2 of getArea() doesn't work", triangleTest2.getArea() == 8.2345678);
		assertTrue("Triangle test2 of getPerimeter() works", triangleTest2.getPerimeter() == 14.5);
		assertFalse("Triangle test2 of getPerimeter() doesn't work", triangleTest2.getPerimeter() == 19);
		
		// To create an instance of Triangle class
		Triangle triangleTest3 = new Triangle(18.3, 12.36, 22.2);
		assertTrue("Triangle test3 of getArea() works", triangleTest3.getArea() == 113.08658431480721);
		assertFalse("Triangle test3 of getArea() doesn't work", triangleTest3.getArea() == 234.874637);
		assertTrue("Triangle test3 of getPerimeter() works", triangleTest3.getPerimeter() == 52.86);
		assertFalse("Triangle test3 of getPerimeter() doesn't work", triangleTest3.getPerimeter() == 60.25);
		
		// To create an instance of Triangle class
		Triangle triangleTest4 = new Triangle(11.6, 7.83, 14.53);
		assertTrue("Triangle test4 of getArea() works", triangleTest4.getArea() == 45.25364545536637);
		assertFalse("Triangle test4 of getArea() doesn't work", triangleTest4.getArea() == 33.333333);
		assertTrue("Triangle test4 of getPerimeter() works", triangleTest4.getPerimeter() == 33.96);
		assertFalse("Triangle test4 of getPerimeter() doesn't work", triangleTest4.getPerimeter() == 14.4444);
		}
	}

