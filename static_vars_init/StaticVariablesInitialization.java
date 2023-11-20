package demo02.static_vars_init;
class Student{
	static int id=1;
	static long section;
	static double percentage;
	static boolean isOnLeave;
	static String name;
	{
		section=2;
	}
	static{
		percentage=78;
		
	}
	Student(){
		isOnLeave=true;
	}
	void staticVarInit() {
		name="raj";
	}
	
}

public class StaticVariablesInitialization {

	public static void main(String[] args) {
		Student student=new Student();
		student.staticVarInit();
		System.out.println("\n"+Student.id);
		System.out.println("\n"+Student.section);
		System.out.println("\n"+Student.percentage);
		System.out.println("\n"+Student.isOnLeave);
		System.out.println("\n"+Student.name);

	}

}
