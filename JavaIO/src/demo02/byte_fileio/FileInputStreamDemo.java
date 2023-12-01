package demo02.byte_fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fStream = new FileInputStream("source.txt");
		int ch = fStream.read();
		System.out.println(ch);
		
		byte[] data = new byte[100];
		fStream.read(data);
		
		System.out.println(Arrays.toString(data));
		
		 fStream.close();

	}

}
