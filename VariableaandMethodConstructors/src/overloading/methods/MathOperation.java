package overloading.methods;

public class MathOperation {
	public int add(int num1,int num2) {
		
		System.out.println("int,int");
		return num1+num2;	}
	public double add(double num1,double num2) {
		System.out.println("double double");
		return num1+num2;  }
	public int add(int num1,int num2,int num3) {
		System.out.println("3 integers");
		return num1+num2+num3;}
		public int add(String n1,String n2) {
			System.out.println("int int");
			return Integer.parseInt(n1)+Integer.parseInt(n2); }
		
	}
		
	


