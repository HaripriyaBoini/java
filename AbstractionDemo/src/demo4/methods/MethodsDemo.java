 package demo4.methods;

public class MethodsDemo {

	public static void main(String[] args) {
		A a=new C();
		a.callMe();
		a.callMetoo();
		
		B b=new C();
		b.callMe();
		b.callMetoo();
		
		C c =new C();
		c.callMe();
		c.callMetoo();
		
		c.greetings();

}
}
