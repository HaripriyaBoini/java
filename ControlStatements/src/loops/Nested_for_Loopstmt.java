package loops;
/* star pattern
 * *
 * **
 * ***
 * ****
 * *****
 */

public class Nested_for_Loopstmt {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++){
				System.out.print("*");
			    }
			System.out.println();
			}

	}

}
