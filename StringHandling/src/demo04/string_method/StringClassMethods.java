package demo04.string_method;

public class StringClassMethods {

	public static void main(String[] args) {
		String str = "THIS is an example string";
		System.out.println(str.length());  
		System.out.println(str.charAt(str.length()-1));
		System.out.println(str.indexOf('e')); 
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println(str.toString());
		System.out.println(str.replace( "example","sample"));
		System.out.println(str.isEmpty());
		System.out.println(str.substring(19,str.length()));
		
		

}
}
