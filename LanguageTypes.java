package Corejavaelements;

public class LanguageTypes {

	public static void main(String[] args) {
		int i=10;                            //In Languagetypes are 2 types 1:static,2:dynamic
		int code=1;                          // in static variabels values already known at compile time
        System.out.println("i value is:" +i);      
        System.out.println("code value is:" +code);
        
        int a=Integer.parseInt(args[0]);   
        float b = Float.parseFloat(args[1]);
        System.out.println("value of a "+a);   // in dynamic type values are given at run time 
        System.out.println("value of b "+b);
        
        
        
		

	}

}
