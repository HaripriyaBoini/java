package Arrays;

public class LargestElement_inArray {

	public static void main(String[] args) {
		// Program to Find the 
				//Largest Element in an Array
				int[] num = {10,23,47,987,123,456,3,2,1,99};
				//987
				int max = num[0];// 987
				int min = num[0];// 987
				
				//to use scanner class
				
				
				
				for(int i=1;i<num.length;i++) {
					if(num[i] > max) {
						max = num[i];
					}
					if(min > num[i]) {
						min = num[i];
					}
				}
				System.out.println("Max Value--->"+max);
				System.out.println("Min Value--->"+min);
				
				}


	

}
