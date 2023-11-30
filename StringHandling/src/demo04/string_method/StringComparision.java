package demo04.string_method;

public class StringComparision {

	public static void main(String[] args) {
		String str1 = "Hello";      //H=72,i=105, e=101
		String str2 = "Hi";         //e-i=-4
		
		int result = str1.compareTo(str2);
		System.out.println(result);           //-4
		
		if(result!=0) {
			System.out.println("strings are not equal");
		}else {
			System.out.println("strings are equal");
		}
		String str3="hello";
		result=str1.compareToIgnoreCase(str3);
        System.out.println(result);

        String str4 ="UnoCareer";
        String str5 ="Unocareer";
        if(str4.equalsIgnoreCase(str5)) {
        	System.out.println("Equal");
        }
        else {System.out.println("unEqual");
        }
        	
        	
        }
	}


