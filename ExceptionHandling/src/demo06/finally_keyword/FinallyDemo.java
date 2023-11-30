package demo06.finally_keyword;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FinallyDemo {

	public static void main(String[] args) {
		FileReader fReader = null;
		FileWriter fWriter = null;
		try {
		fReader = new FileReader("source.txt");
		fWriter = new FileWriter("target.txt");
		
		int k=0;
		StringBuilder sb = new StringBuilder("");
		
		
		while((k=fReader.read())!=-1) {
		sb.append((char)k);
		}
		fWriter.write(sb.toString());
		}
		catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fReader!=null)
					fReader.close();
				if(fWriter!=null)
					fWriter.close();
			}catch(IOException i) {
                System.out.println(i.getMessage());
				
			}
		}
		
		
		
		}
	}


