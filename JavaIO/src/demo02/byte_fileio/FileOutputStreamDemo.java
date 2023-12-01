package demo02.byte_fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException   {
		String str = "This is some dummy text";
		FileOutputStream fStream = new FileOutputStream("target.txt");
	    fStream.write(str.getBytes());
	    fStream.close();
		//System.out.println(Arrays.toString(str.getBytes()));
		//System.out.println(str.getBytes());
		//FileOutputStream fStream = new FileOutputStream("target.txt");
		//fStream.write(78);
		//fStream.close();
		
		

	}
}
