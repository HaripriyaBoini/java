package BinaryOperators;

public class OperatorPrecedence {

	public static void main(String[] args) {
		int result=12-4*2;
		System.out.println(result);
		//if we put paranthesis
		int a=10,b=5,c=1;
		result=a-++c-++b;
		System.out.println(result);
	}

}
