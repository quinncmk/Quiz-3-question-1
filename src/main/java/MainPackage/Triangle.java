package MainPackage;

public class Triangle extends GeometricObject {
	// one side of a triangle
	private double side1 = 1.0;
	
	// one side of a triangle
	private double side2 = 1.0;
	
	// one side of a triangle
	private double side3 = 1.0;
	
	
	// A constructor with no arguments, which creates a default triangle
	public Triangle() {
	}
	
	// A constructor that creates a triangle with the specified side1, side2 and side3
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	// The getter for side1
	public double getSide1() {
		return side1;
	}
	
	// The getter for side 2
	public double getSide2() {
		return side2;
	}
	
	// The getter for side 3
	public double getSide3() {
		return side3;
	}
	
	// To get area of a triangle with specified three sides
	public double getArea() {
		double halfPerimeter = (side1 + side2 + side3) / 2;
		double temp = halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * 
				(halfPerimeter - side3);
		double area = Math.sqrt(temp);
		return area;
	}
	
	// To get perimeter of a triangle with specified three sides
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;		
	}
	
	// To print out description for the triangle
	public String toString() {
		return "The three sides of this triangle are " + side1 + ", " + side2 +
				" and " + side3 + "\nThe area of this triangle is " + getArea() +
				"\nThe perimeter of this triangle is " + getPerimeter();
	}
}
