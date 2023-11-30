package n.DimensionArrays;

import java.util.Arrays;

public class Three_DArray {

	public static void main(String[] args) {
		int[][][] marks={
			{     {60,61},
			      {62,63}
			},
			{
				{64,65},
				{66,67}
			}, 
			{
				{68,69},
				{70,71}
			}
		};
		System.out.println(Arrays.deepToString(marks));
		System.out.println(marks.length);
		System.out.println(marks[0][0].length);
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
					System.out.println("marks:"+marks[i][j][k]);
				}
			}
			
		}
	}

}
