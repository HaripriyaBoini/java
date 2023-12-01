package demo03.console_io;

public class SystemClassMilliSeconds {

	 
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
			long milliSeconds1=System.currentTimeMillis();
			//System.out.println("\n"+ nanoSeconds1);  //7248908558900
			
			concatWithStrings ();
			
			long milliSeconds2=System.currentTimeMillis();
			System.out.println("\n"+ (milliSeconds2-milliSeconds1));  //237850
			
			
			 milliSeconds1=System.currentTimeMillis();
			 //System.out.println("\n"+ nanoSeconds1);  //7248908558900
			
			concatWithSB ();
			
		    milliSeconds2=System.currentTimeMillis();
			System.out.println("\n"+ (milliSeconds2-milliSeconds1));  //237850
			
			

	}

}
