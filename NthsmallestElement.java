package Assignments_Arrays4;

import java.util.Arrays;
import java.util.Scanner;


//find the nth smallest element in the given array

public class NthsmallestElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nthInteger = scanner.nextInt();
		int arrSize= scanner.nextInt();
		
		int[] array = new int[arrSize];
		
		for(int i=0;i<arrSize;i++) {
			
			array[i]=scanner.nextInt();
		}
			
			System.out.println(Arrays.toString(array));
			
			for(int i=0;i<array.length;i++) {
				   for(int j=i+1;j<array.length;j++) {
				   
				   if(nthInteger<arrSize) {
					   if(array[i]>array[j])
					   {
						   int temp = array[i];
					        array[i] = array[j];
					        array[j] = temp;
					   }
				   }//j   
					   
					  
					   }
					   
				   }//i
			//System.out.println(Arrays.toString(arr));

			System.out.println(nthInteger + "rd smallest is: " + array[nthInteger - 1]);

		     scanner.close();
		     
		     
		     }
			
			
			
		
		

		   }
 

		  
	










































/*Scanner scanner =new Scanner(System.in);
System.out.println("Enter nth integer and Enter array size:");

int nthInteger = scanner.nextInt();
int arrSize= scanner.nextInt();

int[] arr= {19,26,3,11,20,8,1,15,6,7};

System.out.println("nthInteger :"+nthInteger);
System.out.println("arrSize :"+arrSize);
System.out.println(Arrays.toString(arr));

for(int i=0;i<arr.length;i++) {
	   for(int j=i+1;j<arr.length;j++) {
	   
	   if(nthInteger<arrSize) {
		   if(arr[i]>arr[j])
		   {
			   int temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp;
		   }
	   }//j   
		   
		  
		   }
		   
	   }//i
System.out.println(Arrays.toString(arr));

System.out.println(nthInteger + "rd smallest is: " + arr[nthInteger - 1]);

scanner.close();
*/



