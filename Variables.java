package Corejavaelements;

public class Variables {

	public static void main(String[] args) {
		/*variables are basic unit of storage in java program
		 * Static variabe : variables declared at compile time
		 * Dynamic variables declared at run rime
		 */
		
          int i=10;
          int j=12;
          int sum = i+j;
          System.out.println("addition is" +sum);
          
          //   DYNAMIC VARIABLES
           int a=Integer.parseInt( args[0]);
           float b=Float.parseFloat(args[1]);
           double addition = a+b;
           System.out.println("sum is " +addition);
          
           
          
          
          
	}

}
