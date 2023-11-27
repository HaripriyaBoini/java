package methods;

public class String_Palindrome {
	public static void main(String[] args) {
		
		//How to check if a String is Palindrome?
		
		// 9889
		// 9889
		
		String str = "4224";
		String newStr = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			newStr = newStr + str.charAt(i);
		}
		System.out.println("old Str--->"+str);
		
		System.out.println("new Str--->"+newStr);
		if(str.contentEquals(newStr)) {
			System.out.println("It is palindrome....");
		}
		else {
			System.out.println("Not palindrome....");
				
		}
				
				
		
	}

}
