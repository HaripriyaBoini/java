package demo01.char_fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		final String FILE_NAME="target.txt";
		
		File file = new File( FILE_NAME);
		FileWriter fileWriter = new FileWriter(file);
		
		//write(int c)
		fileWriter.write(65);
		
		char[] charArr ={'H','e','l','l','o'};
		
		fileWriter.write(charArr);
		fileWriter.write("\n");
		fileWriter.write(charArr);
		
		fileWriter.write("\n");
		
		String str="In hac habitasse platea dictumst";
				fileWriter.write(str);
				fileWriter.write("\n");
		
		fileWriter.write (str,7,16);
		
		
		fileWriter.close();
		
		
	}

}
 