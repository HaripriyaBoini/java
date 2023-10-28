package selection.java;

public class If_else_if_ladder {

	public static void main(String[] args) {
		int noOfYears=5;
		int noOfLeaves=100;
		int incentive;
		if(noOfYears<5)
		{
			incentive=0;
		}else if(noOfLeaves>=0&&noOfLeaves<=30)
		{
			incentive=50000;
		}else {
			incentive=20000;
		}
		System.out.println(incentive);

	}

}
