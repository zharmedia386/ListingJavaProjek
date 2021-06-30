package Task1;

public class Circle {
	private double radius;
	private String color;
	
	// Constructor(overloaded)
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double r) {
		this.radius = r;
		color = "red";
	}
	
	public Circle(double r, String color) {
		this.radius = r;
		this.color = "red";
	}
	
	// Setter|Mutator
	public void setColor(String color) {
		this.color = color;
	}
	
	//  Getter|Accessor
	public String getColor() {
		return color;
	}
	
	// Returns the radius
	public double getRadius() {
		return radius;
	}
	
	// Returns the area 
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public String toString() {
		return "Circle[radius=" + radius + " color=" + color + "]";
	}
}