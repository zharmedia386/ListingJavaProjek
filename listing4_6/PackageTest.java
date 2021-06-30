package listing4_6;

import listing4_6.*;
import static java.lang.System.*;


public class PackageTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		
		harry.raiseSalary(5);
		out.println("name-" + harry.getName() + ",salary-" + harry.getSalary());
	}
}
