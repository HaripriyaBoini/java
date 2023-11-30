package demo03.main_method;
//String[] args= {"12","24"}
public class MainMethodArgs {

	public static void main(String[] args) {
		double num1=Double.parseDouble(args[0]);
		double num2=Double.parseDouble(args[1]);
		
		System.out.println(num1+num2);
		
		System.out.println("hello");
		System.out.println("hello");
		
		int[] marks= {1,2};
		System.out.println(marks);         //  o/p:I@36aa7bc2       I denotes Integer
		
		String n ="unocareer";
		System.out.println(n);
	}

}
