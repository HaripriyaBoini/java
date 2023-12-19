package Assignments_of_ContrlStmts;

public class PrintCharPattern {

	public static void main(String[] args) {
        int n = 8; // Number of rows
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j < n - i - 1 || j >= n + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}


/*for(int i=5;i<5;i--) {
	for(int j=1;j<=i;j++) {
		System.out.print("* ");
	
	}
	System.out.println();
*/