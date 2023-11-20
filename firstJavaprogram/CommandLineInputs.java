package firstJavaprogram;

public class CommandLineInputs {
          //String args={"12","13"}
	
	public static void main(String[] args) {
		System.out.println(args[0]+args[1]);   // prints 1235
		
		//wrapper class
		int num1 = Integer.parseInt(args[0]);
		int num2=  Integer.parseInt(args[1]);
		
		System.out.println(num1+num2);

	}

}
