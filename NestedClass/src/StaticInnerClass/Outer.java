package StaticInnerClass;

public class Outer {
	int outer_x=100;
	static int outer_y;
	private static int outer_z;
	static class Inner{
		void display() {
			//System.out.println("x"+outer.x);
			System.out.println("y"+outer_y);
			System.out.println("z"+outer_z);
			}
		}

}
