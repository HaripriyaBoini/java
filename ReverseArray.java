package Assignments_Arrays4;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
/* 
 *        given an array write a program to reverse the elements in the array
 *        input to the program is array size in (first line)
 *        array elements in (second line)
 *     INPUTS:
 *     10
 *     19 26 3 11 20 8 1 15 6 17
 *     OUTPUT:
 *     17 6 15 1 8 20 11 3 26 19   
 *     
 */
		
		Scanner scanner = new Scanner(System.in);
		int arrSize= scanner.nextInt();
		
		int array[] = new int[arrSize];
		for(int i=0;i<arrSize;i++) {
			array[i]=scanner.nextInt();
		}
		//System.out.println(Arrays.toString(array));
		
		 for (int i = arrSize - 1; i >= 0; i--) { // Fixing the loop for printing in reverse
	            System.out.println(array[i]);
	        }

	       System.out.println(Arrays.toString(array));  
		
	}

}
