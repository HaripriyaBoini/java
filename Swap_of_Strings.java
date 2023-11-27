package methods;

public class Swap_of_Strings {
	
	public static void main(String[] args) {
		
		String  s1 = "Hello";
		String s2 = "Welcome";
		
		System.out.println("Before Swapping---->");
		System.out.println("S1----->"+s1);
		System.out.println("S2----->"+s2);
		
		
		s1 = s1 + s2;// HelloWelcome---12---7---5
		
		s2 = s1.substring(0, s1.length()-s2.length());// Hello
		s1 = s1.substring(s2.length());
		
		System.out.println("After Swapping---->");
		System.out.println("S1----->"+s1);
		System.out.println("S2----->"+s2);
		
		
		
	}



}
