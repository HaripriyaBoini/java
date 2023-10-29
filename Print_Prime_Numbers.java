package Assignments_of_ContrlStmts;

public class Print_Prime_Numbers {

	public static void main(String[] args) {
		System.out.println("enter the range to find the prime numbers");
		int n=Integer.parseInt(args[0]);
		for(int i=0;i<=n;i++) {
			for(;i%2==0;i++) {
				continue;
				}
					System.out.println(i);
					}
					}
			
		}

	


