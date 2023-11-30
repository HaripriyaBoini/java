package demo01.excp_example;

public class ExcpStackTraceDemo {

	 
		static int division(int i) {
			return 10/i;
		}
		static void divideByZero(int i) {
			int a=division(i);
		}
		static void subRoutine() {
			int d=0;
			divideByZero(d);
		}
		public static void main(String[] args) {
			subRoutine();
		}
			
		

	

}
