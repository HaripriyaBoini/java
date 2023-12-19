package Assignments_Arrays4;

import java.util.Arrays;

public class AddMatrices {

	public static void main(String[] args) {
		 int[][] array1 = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };
		        int[][] array2 = {
		            {7, 8, 9},
		            {4, 5, 6},
		            {1, 2, 3}
		        };
		        
		        int[][] sumArray = new int[3][3]; 
		        System.out.println("addition of the 2D array elements ");

		        for (int i = 0; i < array1.length; i++) {
		            for (int j = 0; j < array1[i].length; j++) {
		                sumArray[i][j] = array1[i][j] + array2[i][j]; 
		                System.out.print(sumArray[i][j] + " "); 
		            }
		            System.out.println(); 
		        }
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		  
	       
	       
	       /* int[][] array1 = {
	                {1, 2, 3},
	                {4, 5, 6},
	                {7, 8, 9}
	            };
	        int[][] array2 = {
	                {7, 8, 9},
	                {4, 5, 6},
	                {1, 2, 3}
	        };
               int[][] sumArray = new int[3][];
	            System.out.println("Elements of the 2D array:");
	            
	           
	            
	            for (int i = 0; i < array1.length; i++) {
	               for (int j = 0; j < array1[i].length; j++) {
	            	   
	                    System.out.print(sumArray[i][j]=array1[i][j] + array2[i][j]);
	                    System.out.println((sumArray[i][j])+"");
	               }
	                System.out.println();
	            }
	}*/




