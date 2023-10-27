package BinaryOperators;

public class LogicalOperators {

	public static void main(String[] args) {
		boolean a=true;
		boolean b=false;
		boolean c=a&b;
		if(c)
		{System.out.println("eligible for bonus");
		}
		else
		{System.out.println("Not eligible for bonus");}
		boolean d=!c;
		System.out.println(d);
		System.out.println("-----------------------");
		boolean p=true;
		boolean q=false;
		boolean r=p&q;
		boolean s=p|q;
		boolean t=(!p&q)|(p&!q);
		boolean u=!t;
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(s);
		System.out.println(t);
		System.out.println(u);
	}

}
