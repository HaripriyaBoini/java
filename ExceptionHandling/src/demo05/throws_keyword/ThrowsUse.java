package demo05.throws_keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsUse {
	public static  void readFromFile() throws FileNotFoundException,IOException {
		FileInputStream fStream = new FileInputStream("source.txt");
		
		int k=0;
		while((k=fStream.read())!=-1) {
            System.out.print((char)k);
		}
		fStream.close();
		
		
		
	}

	public static void main(String[] args) {
		      try {
		    	  readFromFile();
		      }catch(FileNotFoundException f ) {
		    	  System.out.println(f.getMessage()); }
		      catch(IOException i) {
		    	  System.out.println(i.getMessage());  
		    	  
		      }
	}

}
