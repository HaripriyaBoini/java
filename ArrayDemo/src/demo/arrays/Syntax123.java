package demo.arrays;

import java.util.Arrays;

public class Syntax123 {

	public static void main(String[] args) {
		int[] monthDays=new int[12];
		monthDays[0]=31;
		monthDays[1]=28;
		monthDays[2]=30;
		monthDays[3]=31;
		monthDays[4]=29;
		monthDays[0]=30;
		monthDays[0]=31;
		System.out.println("April has"+monthDays[2]+"days");
		
		int ages[]=new int[3];
		for(int age:ages)
			System.out.println(age);
		
		System.out.println(Arrays.toString(monthDays));
		System.out.println(monthDays.length);

	}

}
