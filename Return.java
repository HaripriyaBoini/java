package jump;

public class Return {
		static int sum(int num1,int num2) {
			return(num1+num2);
		}
         static void printSum(int num1,int num2) {
	System.out.println("sum="+(num1+num2));
}
         public static void main(String[] args) {
        	 int total=sum(10,20);
        	 System.out.println("total="+total);
        	 printSum(50,20);
         }
}