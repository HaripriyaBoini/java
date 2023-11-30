package local.classes;

public class OuterClass {
	int outer_x=100;
	void test() {
		for(int i=0;i<5;i++) {
			class Inner{
				void display() {
					System.out.println("\n outer_x="+outer_x);
				}
			}
			Inner inner=new Inner();
			inner.display();
			}
			}
		
	}

