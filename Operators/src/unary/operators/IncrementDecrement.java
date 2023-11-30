package unary.operators;

public class IncrementDecrement {

	public static void main(String[] args) {
		int a,b;
		a=10;
		b=++a;
		System.out.println("a="+a+"b="+b);   //pre-increment operator   
		a=10;
		b=a++;                               //post-increment operator  
		System.out.println("a="+a+"b="+b);
		a=10;
		b=--a;                               //pre-decrement operator   
		System.out.println("a="+a+"b="+b);
		a=10;
		b=a--;                               //post-decrement operator
		System.out.println("a="+a+"b="+b);
		
	}

}
