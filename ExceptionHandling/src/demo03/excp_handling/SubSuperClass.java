package demo03.excp_handling;

import java.util.Arrays;

public class SubSuperClass {

	public static void main(String[] args) {
		System.out.println("starts");
		try {
			int number =10;
			int divisor=1;
			int result = number/divisor;
			System.out.println("result="+result);
			
			int[] marks = new int[3];
			marks[0]=35;
			marks[1]=45;
			marks[2]=55;

            System.out.println(Arrays.toString(marks));
            
            String name=null;
            System.out.println(name.length());
            
            
		}
		catch(ArithmeticException a) {
			System.out.println("Arithmetic Exception");}
		catch(Exception e) {
			System.out.println("Either array or npe Exception");
		}
			
		}

	}


