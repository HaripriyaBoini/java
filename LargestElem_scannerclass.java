package Arrays;

import java.util.Scanner;

public class LargestElem_scannerclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pls Enter size of the Elements!!!!");
		int size =sc.nextInt();
		int[] num = new int[size];
		System.out.println("the array elements are:");
		
		for(int i=0;i<size;i++) {
			num[i]=sc.nextInt();
		}
		
		
		//987
		int max = num[0];// 987
		int min = num[0];// 987
		
		
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
