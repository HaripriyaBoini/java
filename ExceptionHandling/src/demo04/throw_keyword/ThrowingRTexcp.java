package demo04.throw_keyword;

public class ThrowingRTexcp {
	public static void ValidateAge(int age)
	{
		try {
			if(age<18) {
				throw new ArithmeticException("not eligible to vote");
			}else {
				System.out.println("Eligible to vote");
			       }
		}
			catch(ArithmeticException a) {
				System.out.println("validate age is generating an exception");
				throw a;
			}
		
	}

	public static void main(String[] args) {
               System.out.println("start");
               int age=15;
               try {
               ValidateAge(age);
               }
               catch(ArithmeticException a) {
            	   System.out.println(a.getMessage());   
            	   }
               System.out.println("end");


	}

}
