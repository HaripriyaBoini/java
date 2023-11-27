package methods;

public class Rev_of_String {
	public static void main(String[] args) {
		
		//Write a java program to reverse a String?
		
		String str = "123456789";
		String newStr = "";
		System.out.println("Old String"+str);
		
		for(int i=str.length()-1;i>=0;i--) {
			newStr = newStr + str.charAt(i);
		}
		
		System.out.println("New String---->"+newStr);
				
				
		
	}


}
