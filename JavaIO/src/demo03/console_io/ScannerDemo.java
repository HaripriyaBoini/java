package demo03.console_io;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte b = scanner.nextByte();
		short s = scanner.nextShort();
		int i = scanner.nextInt();
		long l =scanner.nextLong();
		
		float f =scanner.nextFloat();
		double d =scanner.nextDouble();
		
		boolean bl = scanner.nextBoolean();
		
		scanner.nextLine();
		
		String str = scanner.nextLine();
		
		System.out.println("\n"+b);
		System.out.println("\n"+s);
		System.out.println("\n"+i);
		System.out.println("\n"+l);
		System.out.println("\n"+f);
		System.out.println("\n"+d);
		System.out.println("\n"+bl);
		System.out.println("\n"+str);
		
		
		scanner.close();
		

	}

}
