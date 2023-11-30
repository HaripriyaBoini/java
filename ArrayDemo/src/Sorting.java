import java.util.Scanner;

public class Sorting {

	
		 public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		       
		        int size = scanner.nextInt();
		        int[] array = new int[size];

		        
		        for (int i = 0; i < size; i++) {
		            array[i] = scanner.nextInt();
		        }

		        // Brute force sorting
		        for (int i = 0; i < size - 1; i++) {
		            int minIndex = i;
		            for (int j = i + 1; j < size; j++) {
		                if (array[j] < array[minIndex]) {
		                    minIndex = j;
		                }
		            }
		            // Swap elements
		            int temp = array[minIndex];
		            array[minIndex] = array[i];
		            array[i] = temp;
		        }

		        // Print the sorted array
		        System.out.println("Sorted Array:");
		        for (int num : array) {
		            System.out.print(num + " ");
		        }

		        scanner.close();

	}

}
