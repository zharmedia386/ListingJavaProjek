package Task2;

public class Shape {
	private String color;
	private boolean filled;
	
	public Shape() {
		color = "green";
		filled = true;
	}
	
	public Shape(String c, boolean f) {
		color = c;
		filled = f;
	}
	
	// Getter|Accessor
	public String getColor() {
		return color;
	}
	
	public boolean isXXX() {
		return filled;
	}
	
	// Setter|Mutator
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		return "A Shape with color of "+color+" and "+
			(filled? "filled":"not filled");
	}
}
