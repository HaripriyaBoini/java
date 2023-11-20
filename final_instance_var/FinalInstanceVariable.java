package demo1.final_instance_var;
class Student {
	         int id;
          String name;
          double percentage;
           boolean isOpen;
           //IIB
           {id=1;
           name="arun";
           percentage=89;
           isOpen=true;
           System.out.println("IIb is executed");
           }
}

public class FinalInstanceVariable {

	public static void main(String[] args) {
		Student student=new Student();   //iib is intialized automatically when object created
		System.out.println("student id"+student.id);
		System.out.println("student name"+student.name);
		System.out.println("student percentage"+student.percentage);
		System.out.println("student isOpen"+student.isOpen);
	}

}
