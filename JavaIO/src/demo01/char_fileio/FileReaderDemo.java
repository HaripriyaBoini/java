package demo01.char_fileio;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException{
		FileReader fileReader=new FileReader("source.txt");
		
		
		int ch=0;
		StringBuilder sb = new StringBuilder("");
		
		while((ch=fileReader.read())!=-1) {
		sb.append((char)ch);
		
	} System.out.println(sb);
	       //read(char[] cbuf,int off,int len;
	
	        char[] charArr=new char[100];
	         fileReader.read(charArr,0,99);
	         System.out.println(charArr);
	         
	         char[] charArray = new char[10];
             fileReader.read(charArray);
             System.out.println(Arrays.toString(charArr));
             
	         
	         
	         fileReader.close();
		
		
	}
}         


