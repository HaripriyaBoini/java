package Assignments_Arrays4;

public class Num_Occurences {

	public static void main(String[] args) {
		/*
		 * find the number of occurrences and element in is found in the given array
            NOTE: N should be smaller than the size of the array
            inputs are element in the first line array size in the second line array elements in the third line
            
            iNPUTS: 3
                    10
                    2 3 5 3 1 20 8 3  21 4
             OUTPUT:
             No of Occurences of 3 = 3
		 */
		
		int N=3;
		int sizeOfArray=10;
		int[] arrayElements = {2, 3, 5, 3, 1, 20, 8, 3, 21, 4};
		int count = 0;
		if(N<10)
		{
			for(int i=0;i<sizeOfArray;i++) {
				if(arrayElements[i]==N) {
					count++;
				}
					
				}
			System.out.println("No of occurences of  "+N+" is "+count);
			}
		}
		
		
		

	}


