package demo05.throws_keyword;

import java.io.FileNotFoundException;

public class ThrowingCTExcepts {
	public static void demoProcess() throws FileNotFoundException  {
		
	           throw new FileNotFoundException("demo CT Exception"); 
	        
	}

	public static void main(String[] args) {
             System.out.println("start");
            
            	try {
					demoProcess();
				} catch(FileNotFoundException e) {
					e.printStackTrace();
				}
            	 System.out.println("ends");
           
	}

	}


