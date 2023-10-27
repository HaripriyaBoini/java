package BinaryOperators;

public class AssignmentOperators {        //types of assignmentOperators==Single-assignment & Compound Assignment Operator

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		int d=(2*2)-(b+c);                 //SINGLE-ASSIGNMENT OPERATOR
		System.out.println("value of d"+d);
		System.out.println("COMPOUND ASSIGNMENT OPERATOR");
		int e=10;
		int f=20;
		int g=31;
		e+=5;                              //COMPOUND-ASSIGNMENT OPERATOR
		f*=4;
		g%=6;
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		
				
		
		
		
	}

}
