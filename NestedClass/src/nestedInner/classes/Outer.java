package nestedInner.classes;

public class Outer {
	int outer_x=100;
	class Inner{
		void display()
		{
			System.out.println("\n outer_x:"+outer_x);
			}
		}
         void test() {
        	 Inner inner=new Inner();
        	 inner.display();
        	 }
}
