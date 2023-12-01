package demo04.object_io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectData {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		final String FILE_NAME ="emp_details.txt";
		FileInputStream fStream = new FileInputStream(FILE_NAME);
		
		ObjectInputStream oStream = new ObjectInputStream(fStream);
		
		Employee employee =(Employee)oStream.readObject();
		
		System.out.println(employee);		
		oStream.close();
		fStream.close();

	}

}
 



