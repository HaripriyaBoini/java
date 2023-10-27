/* suppose we went shopping and buy some products
 * 1. A pair of shoes worth 2340/-
 * 2.Grocery worth 1378/-
 * 3.provision worth 1100/-
 * 
 * NOW THERE ARE SOME CONDITIONS
 * A).the pair of shoes has a GSt of 18% and discount of 12%
 * B)if we are members we get a discount of 8% on grocery and 10% on provision
 * C)if we pay through card,we get an additional discount of 5%
 */

package BinaryOperators;

public class Implementation_prgm {

	public static void main(String[] args) {
		final int GST=18;
		final int DISCOUNT=12,PROVISION_DISCOUNT_FOR_MEMBERS=10;
		final int GROCERY_DISCOUNT_FOR_MEMBERS=8;
				final int CARD_DISCOUNT=5;
		double priceofShoes = 2340;
		double priceofGrocery = 1378;
		double priceofProvision = 1100;
		boolean isMember = true;
		priceofShoes=priceofShoes+(GST+priceofShoes)/100-(DISCOUNT*priceofShoes)/100;
		if(isMember)
			priceofGrocery=priceofGrocery-(GROCERY_DISCOUNT_FOR_MEMBERS*priceofGrocery)/100;
		    priceofProvision=priceofProvision-(PROVISION_DISCOUNT_FOR_MEMBERS*priceofProvision)/100;
		    double totalprice=priceofShoes+priceofGrocery+priceofProvision;
		    boolean iscard=true;
		    if(iscard) {
		    	totalprice=totalprice-(totalprice*CARD_DISCOUNT)/100;
		    	
		    }
              System.out.println("Total cost is"+totalprice);
	}

}

/* if we want to give inputs ,then we can go to parse method in runtime
 * 
 * double priceofShoes=Double.parseDouble(args[0]);
 * double priceofGrocery=Double.parseDouble(args[0]);
 * double priceofProvision=Double.parseDouble(args[0]);
 * 
 * boolean isMember=Boolean.parseBoolean(args[3]);
 * boolean isCard=Boolean.parseBoolean(args[4]);
*/