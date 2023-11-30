package demo01.supreme_class;

public class Supreme_class {
	enum DAYTIME{
		MORNING,NOON,EVENING,NIGHT; 
	}

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
System.out.println(a instanceof A);
System.out.println(a instanceof Object);
System.out.println(b instanceof Object);

String str="raj";
System.out.println(str instanceof Object);

int marks[] = new int[2];
System.out.println(marks instanceof Object);

DAYTIME d = DAYTIME.MORNING;
System.out.println(d instanceof Object);


	}

}
