package Task2;

public class Square extends Rectangle{
	// Constructor
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(side, side, color,  filled);
	}
	
	// Setter | Mutator
	@Override
	public void setWidth(double side) {
		super.setWidth(side);
		setLength(side);
	}
	
	@Override
	public void setLength(double side) {
		super.setLength(side);
		setWidth(side);
	}
	
	// Getter | Accessor
	@Override
	public double getArea() {
		double Area;
		Area = super.getLength() * super.getWidth();
		return Area;
	}
	
	@Override
	public double getPerimeter() {
		double Perimeter;
		Perimeter = (4*super.getLength());
		return Perimeter;
	}
	
	@Override
	public String toString() {
		return "A Square with side="+super.getLength()+", which is a subclass of "+
			super.toString();
	}
}
