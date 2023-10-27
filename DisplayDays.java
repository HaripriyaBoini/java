package Corejavaelements;

/**
 * @author dell
 *
 */
public class DisplayDays {

	public static void main(String[] args) {
		int days = 574;
		int years;
           System.out.println("enter the days");
           years=days/365;
           days=days-(365*years);
           int months = days/30;
           int d=days-(months*30);
           System.out.println("years"+years);
           System.out.println("months"+months);
           System.out.println("days"+d);
          
           //days=1065
           int days1 = 1065;
   		int years1;
              System.out.println("enter the days");
              years1=days1/365;
              days1=days1-(365*years);
              int months1 = days1/30;
              int d1=days1-(months1*30);
              System.out.println("years"+years1);
              System.out.println("months"+months1);
              System.out.println("days"+d1);
           
	}

}
