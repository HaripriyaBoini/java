package javaprgm;

import java.util.Scanner;

public class Demo02 {

	public static void main(String[] args) {
		
		char ch;
	    ch = 'p';

	     ch = (char)(ch - 32);

	    boolean vowel = (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');

	    if (vowel=true) {
	        System.out.println(ch + " is a vowel.");
	    } else {
	        System.out.println(ch + " is not a vowel.");
	    }
	}
}
		
	/* java  program to input any alphabet and check whether it is vowel or consonant in both uppercase and lowercase
	 * 
	 *          Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter an alphabet: ");
		        char ch = scanner.nextLine().charAt(0);
		        
		        String result = (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') ?
		                (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
		                 ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ?
		                        "Vowel" : "Consonant" : "Invalid input (not an alphabet)";

		        System.out.println( + ch + " is a " + result );

		        scanner.close();

	*/

