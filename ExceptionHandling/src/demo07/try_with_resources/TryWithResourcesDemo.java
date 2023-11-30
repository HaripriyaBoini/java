package demo07.try_with_resources;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesDemo {

	public static void main(String[] args) {
		
		//try(FileReader fReader = new FileReader("source.txt");FileWriter fWriter=new FileWriter("target.txt"));
			//	{
			
		//}
		
		//FileReader fReader = null;
		//FileWriter fWriter = null;
		try (
		FileReader fReader = new FileReader("source.txt");
		FileWriter fWriter = new FileWriter("target.txt");
		){
		
		int k=0;
		StringBuilder sb = new StringBuilder("");
		
		
		while((k=fReader.read())!=-1) 
		{
			sb.append((char)k);
		}
		   fWriter.write(sb.toString());
		}
		catch(IOException i) {
			System.out.println(i.getMessage());
		}
	}//finally {
		//	try {
			//	if(fReader!=null)
				//	fReader.close();
				//if(fWriter!=null)
					//fWriter.close();
			//}catch(IOException i) {
              //  System.out.println(i.getMessage());
				
			//}
		//}
		
		
		
		}
	


