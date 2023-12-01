package demo04.object_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectData {

	public static void main(String[] args) throws IOException {
		final String FILE_NAME="emp_details.txt";
		FileOutputStream fOs = new FileOutputStream(FILE_NAME);
		
		Employee employee = new Employee(101,"manish",300000,true,'m');
		ObjectOutputStream oStream = new ObjectOutputStream(fOs);
		
	}

}
