package demo03.console_io;

import java.util.Properties;

public class SystemClassProperties {

	public static void main(String[] args) {
		//Properties properties = System.getProperties();
		//System.out.println(properties);
		
		System.out.println(System.getProperty("java.v.vendor"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("javaspecificatio.vendor"));
		System.out.println(System.getProperty("os.name"));

	}

}
