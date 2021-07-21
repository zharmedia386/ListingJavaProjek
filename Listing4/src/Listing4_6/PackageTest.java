package Listing4_6;
import Listing4_7.*;
// the Employee class is defined in that package

import static java.lang.System.*;

/**
 * This program demonstrate the use of package
 * @version 1.11 2004-02-19
 * @author Cay Horstmann
 */

public class PackageTest {
	public static void main(String[] args){
		//because of the import statement, we don't have to use
		//Listing4_7.Employee here
		Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);
		
		harry.raiseSalary(5);
		
		//because of the static import statement, we don't have to use the System.out here
		out.println("name="+harry.getName()+",salary="+harry.getSalary());
	}
}
