package demo03.excp_handling;

import java.util.Arrays;

public class NestedTryCatch {

	public static void main(String[] args) {
		System.out.println("starts");
		try {
			int number =10;
			int divisor=1;
			int result = number/divisor;
			System.out.println("result="+result);
			 try {
				 int c[]= {1,67,89};
				 c[2]=75;
				 System.out.println(Arrays.toString(c));
				 }
			 
				 catch(ArrayIndexOutOfBoundsException e) {
					 System.out.println("ArrayIndexOutOfBoundsException handled");
				 } 
		}
		catch(ArithmeticException a) {
			System.out.println("Arithmetic Exception Handled");
		}//catch(ArithmeticException a) {      //catch with same exception type cannt come in same space
			//System.out.println("Arithmetic Exception Handled");
		//}

		System.out.println("ends");
	}
			 
		

	}


