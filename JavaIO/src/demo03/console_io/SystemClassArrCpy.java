package demo03.console_io;

import java.util.Arrays;

public class SystemClassArrCpy {

	public static void main(String[] args) {
		int[] source = {1,2,3,4,5,6,7,8};
		int[] destination = {8,9,10,11,12,13,14};
		System.out.println("\n source"+Arrays.toString(source));
		System.out.println("\n dest"+Arrays.toString(destination));
		
		System.arraycopy(source,2,destination,3,4);
		
		System.out.println("\n dest"+Arrays.toString(destination));
		

		

	}

}
