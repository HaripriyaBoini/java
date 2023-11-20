package demo02.static_vars;
class Student{
	static int id;
	static long section;
	static double percentage;
	static boolean isOnLeave;
	static String name;
}

public class StaticVariables {

	public static void main(String[] args) {
		Student student=new Student();
		System.out.println("\n"+Student.id);
		System.out.println("\n"+Student.section);
		System.out.println("\n"+Student.percentage);
		System.out.println("\n"+Student.isOnLeave);
		System.out.println("\n"+Student.name);

	}

}
