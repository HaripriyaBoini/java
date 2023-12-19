package Assignments_of_ContrlStmts;

import java.util.Scanner;

public class PrintPrimeNos {
	static void PrimeNos(int start,int end){
		//int start1 = 5;
		//int end1 =53;
		for(int i=1;i<end;i++) {
			int a=(6*i)-1;
			int b=(6*i)+1;
			
			
			
				if((a>5&&a<53)&&isPrime(a))   //excludes 5,excludes 53
					System.out.println(a);   
				                             
				
			
			
				if(b<53&&isPrime(b)) 
					System.out.println(b);
				
			
			if(b>end&&a<end) 
				break;
			
			
			
			}
		}
	
	
	static boolean isPrime(int num){
	
			int count =0;
			for(int i=1;i<=num;i++) {
				if(num % i == 0) 
					count++;
			}
			if(count == 2) 
				return true;
			else  
				return false;
		}
		
	                                   
		
		
public static void main(String[] args) {
		//PrimeNos(5,53);
		Scanner scanner = new Scanner(System.in);
		//String s = "5e";
		System.out.println("enter the values between :");
		int c=scanner.nextInt();
		
		int d=scanner.nextInt();
		System.out.println("are");
		PrimeNos(c,d);
	}
	
	}
/*
 * IncludingPrimeNos(5,53)
 * 
 * static void  IncludingPrimeNos(5,53){
 * if((a>=5&&a<=53)&&isPrime(a)) 
 * System.out.println(a);
 * if(b<=53&&isPrime(b)) 
	System.out.println(b);
 */


