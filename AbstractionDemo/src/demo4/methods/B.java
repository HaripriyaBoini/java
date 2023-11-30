package demo4.methods;

public abstract class B extends A    {
	@Override
	void callMetoo() {
		System.out.println( "B's call me too");
	}
	 @Override
	void callMe() {
		 System.out.println("b's call me"); }
		 
	abstract void greetings();

} 
