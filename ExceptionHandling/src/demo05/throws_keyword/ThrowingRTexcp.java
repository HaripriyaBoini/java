package demo05.throws_keyword;

public class ThrowingRTexcp {
	public static void ValidateAge(int age) throws ArithmeticException{
	 
			if(age<18) {
				throw new ArithmeticException("not eligible to vote");
			}else {
				System.out.println("Eligible to vote");
			}
		
			
		
	}

	public static void main(String[] args) {
               System.out.println("start");
               int age=15;
              
            
               try {
				ValidateAge(age);
			} catch (ArithmeticException e) {
				
                System.out.println(e.getMessage());
			}
             
              
         System.out.println("end");


	}

}
