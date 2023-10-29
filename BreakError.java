package jump;

public class BreakError {

	public static void main(String[] args) {
		for(int i=0;i<3;i++) {
			System.out.println("i="+i);
		}
		one:
			for(int j=0;j<3;j++) {
				if(j==2) 
					break one;
						System.out.println("\n j="+j);
				}
			}
	}

		
	


