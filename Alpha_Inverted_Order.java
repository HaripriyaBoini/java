package Assignments_of_ContrlStmts;

public class Alpha_Inverted_Order {

	
			
			// Function to print pattern 
			static void ReverseCharBridge(int n) 
			{ 
				for (int i = 0; i < n; i++) 
				{ 
					for (int j = 'A'; j < 'A' + (2 * n) - 1; j++) 
					{ 
					if (j >= ('A' + n - 1) + i) 
						System.out.print((char)(('A' + n - 1) - 
										(j % ('A' + n - 1)))); 
						else if (j <= ('A' + n - 1) - i) 
							System.out.print((char)j); 
						else
							System.out.print(" "); 
					} 
					System.out.println(); 
				} 
			} 
			
			// Driver Code 
			public static void main(String args[]) 
			{ 
				int n = 6; 
				ReverseCharBridge(n); 
			} 
		} 

		

	
      
