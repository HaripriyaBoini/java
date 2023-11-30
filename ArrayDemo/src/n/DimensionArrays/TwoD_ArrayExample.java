package n.DimensionArrays;

import java.util.Arrays;

public class TwoD_ArrayExample {

	public static void main(String[] args) {
		//int[][] marks=new int[3][2];
		int[][] marks= {
				{61,62},
				{56,67},
				{67,78}
		};
		System.out.println(Arrays.deepToString(marks));
		
		System.out.println(marks.length);
		System.out.println(marks[0].length);
	}

}
