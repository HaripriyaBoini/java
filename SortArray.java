package Assignments_Arrays4;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		
		/*given an array write a program to sort the elements in the array in ascending order and print the sorted array.
		Inputs to the program is array size(in first line)
		Array elements (in second line)

         Use brute force method to sort the elements
         INPUTS:
         10
         19 26 3 11 20 8 1 15 6 17
         OUTPUTS:
         1 3 6 8 11 15 17 19 20 26
         */
		
		Scanner scanner = new Scanner(System.in);

        // Input array size
        int arrSize = scanner.nextInt();

        // Input array elements
        int[] array = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            array[i] = scanner.nextInt();
        }

        // Sorting using brute force (Bubble Sort)
        for (int i = 0; i < arrSize - 1; i++) {
            for (int j = 0; j < arrSize - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap if elements are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Printing the sorted array
        for (int i = 0; i < arrSize; i++) {
            System.out.print(array[i] + " ");
        }
		
	
	}
	}
		
		
		
		
	
		

	
		
	



