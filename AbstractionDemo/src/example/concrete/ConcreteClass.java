package example.concrete;
class Test{
	int add(int number1,int number2) {
		return number1+number2;
	}
}

public class ConcreteClass {
	public static void main(String[] args) {
		
	Test test = new Test();
	System.out.println(test.add(10,11));

}
}
