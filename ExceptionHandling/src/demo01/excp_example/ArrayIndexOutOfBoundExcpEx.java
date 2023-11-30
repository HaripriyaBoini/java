package demo01.excp_example;

import java.util.Arrays;

public class ArrayIndexOutOfBoundExcpEx {

	public static void main(String[] args) {
               System.out.println("program starts");
               int[] marks = new int[3];
               marks[1]=20;
               marks[2]=30;
               marks[3]=50;
               System.out.println(Arrays.toString(marks));
               System.out.println("program ends");

	}

}
