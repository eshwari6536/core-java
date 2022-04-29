package abt.com;

//Java program to illustrate the
//concept of Abstraction
abstract class Shape {
	String color;

	// these are abstract methods
	abstract double area();
	public abstract String toString();

	// abstract class can have the constructor
	public Shape(String color)
	{
		System.out.println("Shape constructor called");
		this.color = color;
	}

	// this is a concrete method
	public String getColor() { 
		return color; 
		}
}
class Circle extends Shape {
	double radius;

	public Circle(String color, double radius)
	{

		// calling Shape constructor
		super(color);
		System.out.println("Circle constructor called");
		this.radius = radius;
	}

	@Override double area()
	{
		return Math.PI * Math.pow(radius, 2);
	}

	@Override 
	public String toString()
	{
		return "Circle color is " + super.getColor()
			+ "and area is : " + area();
	}
}
class Rectangle extends Shape {

	double length;
	double width;

	public Rectangle(String color, double length,
					double width)
	{
		// calling Shape constructor
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}

	@Override
	double area() { 
		return length * width; 
		}

	@Override 
	public String toString()
	{
		return "Rectangle color is " + super.getColor()
			+ " and area is : " + area();
	}
}
	class Square extends Shape{
		double side;
		public Square(String color, double side)
{
	// calling Shape constructor
	super(color);
	System.out.println("Square constructor called");
	this.side = side;
}
		@Override
		double area() {
			// TODO Auto-generated method stub
			return side*side;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Square color is " + super.getColor()
			+ " and area is : " + area();
		}
	}

public class BasicsAbst {
	public static void main(String[] args)
	{
		Shape s1 = new Circle("Red", 2.2);
		Shape s2 = new Rectangle("Yellow", 2, 4);
		Shape s3 = new Square("Blue",6);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
}

