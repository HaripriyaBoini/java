package n.DimensionArrays;

import java.util.Arrays;

public class Jagged_or_raggedArray {

	public static void main(String[] args) {
		int[][] marks=new int[3][];
		marks[0]=new int[3];             //0th students 3 subjects
		marks[1]=new int[1];
		marks[2]=new int[2];
		
		//student 1
		marks[0][0]=65;                 // 1 student has 1sub
		marks[0][1]=55;
		marks[0][2]=85;
		
		//student 2                     //student 2 has 2 subjects
		marks[0][1]=89;
		
		//student 3
		marks[2][0]=90;
		marks[0][1]=91;
		
System.out.println(Arrays.deepToString(marks));
for(int i=0;i<marks.length;i++) {
	for(int j=0;j<marks[i].length;j++) {
		System.out.println(marks[i][j]);
		
	}

		
		
			
		}
	}

}
