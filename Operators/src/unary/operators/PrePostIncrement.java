package unary.operators;

public class PrePostIncrement {

	public static void main(String[] args) {
		int a=1,b=2,c,d;
		c=++b;
		d=a++;
		c++;
		System.out.println(a); 
		System.out.println(b); //3
		System.out.println(c);//4
		System.out.println(d);//1
		
		

	}

}
