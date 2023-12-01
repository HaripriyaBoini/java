package demo02.byte_fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
                final String SOURCE_FILE="motivaton.png";
                final String NEW_FILE="new motivation.png";
                
                FileInputStream fInputStream = new FileInputStream(SOURCE_FILE);
                FileOutputStream fOutputStream =new FileOutputStream(NEW_FILE);
                
                fOutputStream.write(fInputStream.readAllBytes());
                
                fInputStream .close();
                fOutputStream.close();
                
                

	}

}
