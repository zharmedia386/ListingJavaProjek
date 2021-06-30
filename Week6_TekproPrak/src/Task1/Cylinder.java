package Task1;

public class Cylinder extends Circle{
	private double height;
	
	// Constructor 
	public Cylinder() {
		super();
		height = 1.0;
	}
	
	// Constructor
	public Cylinder(double height) {
		super();
		this.height = height;
	}
	
	// Constructor
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	// Inherits getArea()
	public double getArea() {
		return ((2*(super.getArea())) + (2*Math.PI*getRadius()*height));
	}
	
	// Retrieving the height
	public double getHeight() {
		return height;
	}
	
	// Superclass method getArea()
	public double getVolume() {
		return (super.getArea()*height);
	}
	
	@Override
	public String toString() {
		return "Cylinder: subclass of " + super.toString() + " height=" + height;
	}
}

