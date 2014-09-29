package MainPackage;

public class Triangle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	}
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	//The no argument constructor
	Triangle() {
	}
	
	/* A constructor that creates a triangle 
	 * with the specified side1, side2, and side3
	 */
	public void Tringle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	//The accessor methods for all three data methods
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	//A method named getArea() that returns the area of this triangle.
	public double getArea() {
		
		double p = (side1 + side2 + side3) / 2;
		double inside = (p - side1) * (p - side2) * (p - side3);
		double radicand = p * inside;
		double formula = Math.sqrt(radicand);
		return formula;
	}
	//A method named getPerimeter() that returns the perimeter of this triangle.
	public double getPerimeter() {
		double p;
		p = side1 + side2 + side3;
		return p;
	}
	
	//A method named toString() that returns a string description for the triangle
	public String toString() {
		return ("Triangle: side1 = " + side1 + "side 2 = " + side2 + " side3 = " + side3);
	}	
}
