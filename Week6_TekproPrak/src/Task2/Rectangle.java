package Task2;

public class Rectangle extends Shape{
	private double width;
	private double length;
	
	// Constructor
	public Rectangle() {
		super();
		this.width = 1.0;
		this.length = 1.0;
	}
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	// Getter|Accessor
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	// Setter|Mutator
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	// getArea() & getPerimeter()
	public double getArea() {
		double Area= length*width;
		return Area;
	}
	
	public double getPerimeter() {
		double Perimeter = (2*length)+(2*width);
		return Perimeter;
	}
	
	// ToString
	public String toString() {
		return "A Rectangle with width="+width+" and length="+
			length+",which is a subclass of"+super.toString();
	}
}
