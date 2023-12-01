package demo03.console_io;

import java.util.Map;

public class SystemClassEnvVars {

	public static void main(String[] args) {
		Map<String ,String> envVariables =System.getenv();
		//System.out.println(envVariables);
		
		System.out.println(System.getenv("LOCALAPPDATA"));
		System.out.println(System.getenv("USERNAME"));
		System.out.println(System.getenv("ProgramFiles(x86)"));
		System.out.println(System.getenv("TMP"));
		System.out.println(System.getenv("NUMBER_OF_PROCESSORS"));
		
		

	}

}
