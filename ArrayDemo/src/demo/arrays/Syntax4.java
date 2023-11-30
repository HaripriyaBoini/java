package demo.arrays;

import java.util.Arrays;

public class Syntax4 {

	public static void main(String[] args) {
		//static initialization
		int[] monthlyDays= {31,28,31,30,31,30,31,31,30};
		System.out.println("April has"+monthlyDays[3]+"days");
		System.out.println(Arrays.toString(monthlyDays));
		System.out.println(monthlyDays.length);
		}
	}


