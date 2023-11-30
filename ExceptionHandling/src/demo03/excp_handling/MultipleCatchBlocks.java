 package demo03.excp_handling;

import java.util.Arrays;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		System.out.println("starts");
		String name=null;
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
            
            System.out.println(name.length());
			}
			catch(ArithmeticException a) {
				System.out.println("arithmetic exception has occured"); }
		
				catch(ArrayIndexOutOfBoundsException ae) {
					System.out.println("Array index out of exception has occured");
				}
					
					catch(NullPointerException npe) {
					name="unocareer";
					System.out.println("Inside catch "+name);
					}
					System.out.println("ends");
				
				}	
	}
	

		

	


