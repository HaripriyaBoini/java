package loops;

public class For_Loop_stmt {

	public static void main(String[] args) {
		int lastNumber=10;
		int sum=0;
		for(int start_number=1;start_number<=lastNumber;start_number++)
		{
			sum=sum+start_number;
		}
	    System.out.println("sum of first 10 numbers is:"+sum);
	}

	}


