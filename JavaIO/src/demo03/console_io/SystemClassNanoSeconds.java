package demo03.console_io;

public class SystemClassNanoSeconds {
	
	public static String concatWithStrings() {
		String str ="abc";
		for(int i=0;i<5;i++) {
			str = str+"def";
		}
		return str;
	}
	
	public static StringBuilder concatWithSB() {
		
		StringBuilder sb = new 	StringBuilder("ab");
		
		for(int i=0;i<5;i++) {
			sb.append("def");
		}
		return sb;
	}

	public static void main(String[] args) {
		long nanoSeconds1=System.nanoTime();
		//System.out.println("\n"+ nanoSeconds1);  //7248908558900
		
		concatWithStrings ();
		
		long nanoSeconds2=System.nanoTime();
		System.out.println("\n"+ (nanoSeconds2-nanoSeconds1));  //237850
		
		
		 nanoSeconds1=System.nanoTime();
		 //System.out.println("\n"+ nanoSeconds1);  //7248908558900
		
		concatWithSB();
		
	    nanoSeconds2=System.nanoTime();
		System.out.println("\n"+ (nanoSeconds2-nanoSeconds1));  //237850
		

	}

}
