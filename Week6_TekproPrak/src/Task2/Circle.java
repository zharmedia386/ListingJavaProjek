package Task2;

public class Circle extends Shape{
	private double radius;
	
	// Constructor
	public Circle() {
		super();
		radius = 1.0;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius=radius;
	}
	// Getter|Accessor
	public double getRadius() {
		return radius;
	}
	
	// Setter|Mutator
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// Method getArea() and getPerimeter()
	public double getArea() {
		double Area = 2*Math.PI*Math.pow(radius,2);
		return Area;
	}
	
	public double getPerimeter() {
		double Perimeter = 2*Math.PI*radius;
		return Perimeter;
	}
	
	// Overriding
	public String toString() {
		return "A Circle with radius="+radius+",which is a subclass of "+
			super.toString();
	}
}
