package javaprgm;

public class NoPattern_7 {

	public static void main(String[] args) {
		/*
		 * 1 2 3 4 5
		 * 1 2 3 4
		 * 1 2 3
		 * 1 2 
		 * 1 	
		 */
		for(int r=1;r<=5;r++) {
			for(int c=5;c<=r;c--) {
				System.out.print(c + " ");
			}
			System.out.println();
		}

	}

}
