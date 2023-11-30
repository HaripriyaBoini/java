package nestedInner.classes;

public class Main {

	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.test();
		
		Outer.Inner inner=new Outer().new Inner();
		inner.display();
		
		//void show() {
			//System.out.println(inner_y);
		//}
	}
	

}
