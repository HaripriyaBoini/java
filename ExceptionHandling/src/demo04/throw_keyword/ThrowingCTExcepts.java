package demo04.throw_keyword;

import java.io.FileNotFoundException;

public class ThrowingCTExcepts {
	public static void demoProcess() throws FileNotFoundException  {
		try {
	           throw new FileNotFoundException("demo CT Exception"); }
	         catch(FileNotFoundException f) {
	        	 System.out.println(f);
	        	 throw f;
	         }
	         }

	public static void main(String[] args) {
             System.out.println("start");
            try {
            	demoProcess();
            }
            catch(FileNotFoundException f) {
            	System.out.println(f.getMessage());
            }
            System.out.println("ends");
            
             

	}

}
