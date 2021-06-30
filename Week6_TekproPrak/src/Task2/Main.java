package Task2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape("black",false);
		System.out.println(s.toString());
		
		Rectangle r = new Rectangle(4.0,5.2,"yellow",true);
		System.out.println(r.toString()+",area= "+r.getArea()
			+", perimeter="+r.getPerimeter());
				
		Circle c = new Circle(4.0, "yellow", true);
		System.out.println(c.toString()+",area="+r.getArea()
			+", perimeter="+c.getPerimeter());
		
		Square sq = new Square(4.0,"yellow",true);
		System.out.println(sq.toString()+",area="+sq.getArea()
			+", perimeter="+sq.getPerimeter());
	}
}
