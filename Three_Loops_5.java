package javaprgm;

public class Three_Loops_5 {

	public static void main(String[] args) {
		int p=10;
		do {
			System.out.println("program begins....."+p);
			p++;/// 11
		}while(p <=5);// 11 <=5--- false
		
		// while
		int h=1;
		while(h<=5) {
			System.out.println("program processing...."+h);
			h++;
		}
		
		for(int k=10;k<=5;k++) {
			System.out.println("Java....."+k);
		}
		System.out.println("Program Ends");


	}

}
