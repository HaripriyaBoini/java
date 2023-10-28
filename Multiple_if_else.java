package selection.java;

public class Multiple_if_else {

	public static void main(String[] args) {
		int noOfYears=5;
		int noOfLeaves=10;
		int incentive=0;
		if(noOfYears>=5&&(noOfLeaves>=0&&noOfLeaves<=30))
		{
			incentive=50000;	
		}
		if(noOfYears>=5&&(noOfLeaves>=31&&noOfLeaves<=60))
		{
			incentive=20000;
			
		}
			if(noOfYears<5)
			{
				incentive=0;
			}
			System.out.println(incentive);
			
			}

}
