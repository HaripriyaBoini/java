package method.vararg;

import java.util.Arrays;

public class VarargMethod {

		public static void vaTest(int...v) {
			int sum=0;
			for(int i:v) {
				sum=sum+i; }
			System.out.println("sum of inputs"+sum);}
		
		public static void vaTest(String msg,int...v)
		{int sum=0;
		for(int i:v) {
			sum=sum+i; }
		System.out.println("sum of inputs"+sum); }
			
		
		public static void vaTest(boolean...v) {
			System.out.println(Arrays.toString(v));
			System.out.println("boolean");
		}
		
		public static void main(String[] args) {

			vaTest(1);
			vaTest(1,2,3);
			vaTest("hi",1);
			vaTest("hi",1,2,3);
			vaTest(true,false);
			
		}

	}


