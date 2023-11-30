package overloading.methods;

public class MethodOverloading {

	public static void main(String[] args) {
		MathOperation addition=new MathOperation();
System.out.println(addition.add(10,20));
System.out.println(addition.add(10.5,20.2));
System.out.println(addition.add(10,20,30));
System.out.println(addition.add("56","65"));

		}

}
