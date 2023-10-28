package selection.java;
//if the employee has worked for 5 or more years,incentives=50k,if leaves(0-30)
//60>=leaves>=31: incentives==20k
//if no. of years<5, 0 bonus/incentives


public class Nested_if_else {

	public static void main(String[] args) {
		int noOfYears = 5;
		int noOfLeaves = 15;
		int incentive;
			if(noOfLeaves>=5) {
				if(noOfLeaves>=0 && noOfLeaves<=30) {
					incentive=50000;
				}else {
						incentive=20000;
				}		
			}else {
			      incentive=0;
			}      
			System.out.println(incentive);
				}
			
		
	}


