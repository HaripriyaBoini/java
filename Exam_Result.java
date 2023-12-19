package Assignments_of_ContrlStmts;

import java.util.Scanner;

public class Exam_Result {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		if(A>=45&&B>=45) {
			System.out.println("the student is passed");
		}else if(A<=45&&B>=45) {
			System.out.println("the student is failed");
		}
			 if(A>=45||B<45) {
				System.out.println("student has to reappear in exam B");}
			
		
		scanner.close();
	}
}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


