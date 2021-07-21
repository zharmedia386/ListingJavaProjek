package iniPackage1;

import java.util.*;

public class MainDriver {
	/*generic method*/
	public static<E> void printArray(E[] inputArray){
		 for(E element : inputArray)
		 System.out.printf("%s",element);
		 System.out.println("");
	}
	
//	/*generic wildcard*/
//	private static double sum(Double<? extends Number> list) 
//	    {
//	        double sum=0.0;
//	        for (Number i: list)
//	        {
//	            sum+=i.doubleValue();
//	        }
//	  
//	        return sum;
//	    }
	
	public static void main (String[] args) {
		Integer[] intArray = {1,2,3,4,5} ;
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
		Character[] charArray = {'J','A','V','A'};
		 
		printArray(intArray);
		 printArray(doubleArray);
		 printArray(charArray);
	}
}

