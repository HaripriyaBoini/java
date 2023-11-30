package demo05.sb;

public class StringBuilderDemo {

	public static void main(String[] args) {
		String greet  ="hi";
		StringBuilder greetings = new StringBuilder(greet);
		System.out.println(greetings);

		greetings.append(",good morning");
		System.out.println(greetings);
		
		greetings.insert(2,"everyone");
		System.out.println(greetings);
		
		int indexOfG=greetings.indexOf("g");
		int indexOfM=greetings.indexOf("m");
		
		System.out.println(indexOfG);
		System.out.println(indexOfM);
       greetings.delete(indexOfG,indexOfM);	
       
       String str = greetings.toString();
       
       System.out.println(greetings);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		}

}
