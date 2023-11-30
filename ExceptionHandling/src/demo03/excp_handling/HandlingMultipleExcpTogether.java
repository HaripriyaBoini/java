package demo03.excp_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingMultipleExcpTogether {

	public static void main(String[] args) {
		try{String trainerName="Kastubh";
		System.out.println("last character :"+trainerName.charAt(trainerName.length()-1));
		
		int number=Integer.parseInt("1");
		System.out.println("number="+number);
		
		Scanner scanner=new Scanner(System.in);
				int number2=scanner.nextInt();
				System.out.println("Number2="+number2);
				scanner.close();
		}catch(StringIndexOutOfBoundsException|NumberFormatException|InputMismatchException sni) {
			System.out.println("oops something wrong happened");}
		
	}
		
		
	}


