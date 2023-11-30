package BinaryOperators;

public class ShortCircuit_OR_Operator {

	public static void main(String[] args) {
		int c=0,d=100,e=50;
		if(c==1||e++<100)
		{
			d=150;
		}
		System.out.println(d);
		System.out.println(e);
	}

}

	


