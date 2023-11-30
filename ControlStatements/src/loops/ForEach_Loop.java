package loops;

import java.util.List;

public class ForEach_Loop {

	public static void main(String[] args) {
		//String [] names= {"jay","yash","naved","bill"};
		List<String> names = List.of("jay","yash","naved","bill");
		names.forEach(n->{
			System.out.println("hi "+n);
		                  });
		
		}

	};