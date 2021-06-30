package factorials;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);
        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            System.out.print("Enter an integer: ");
            int val = scan.nextInt();
            try {
            	 System.out.println("Factorial(" + val + ") = " +
                         MathUtils.factorial(val));
            }catch(IllegalArgumentException i) {
            	System.out.println(i);
            }
            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }
        scan.close();
    }
}

class MathUtils {
    public static int factorial(int n) throws IllegalArgumentException {
        if(n < 0)
        	throw new IllegalArgumentException("Negative Value Exception");
        else if(n > 16)
        	throw new IllegalArgumentException("Arithmetic Overflow");
    	int fac = 1;
        for (int i = n; i > 0; i--)
            fac *= i;
        return fac;
    }
}
