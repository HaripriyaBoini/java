package Assignments_of_ContrlStmts;

public class PrintGrade {

	public static void main(String[] args) {
		int marks;    //72
		marks=Integer.parseInt(args[0]);
		String grade = (marks >= 90 && marks <= 100) ? "Grade A" :
            ((marks >= 75 && marks <=89) ? "Grade B" :
            ((marks >= 60 && marks <= 74) ? "Grade C" : "Grade D"));
            System.out.println(grade);   //grade c
	}

}
