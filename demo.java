package javaprgm;



public class demo {
		public static void main(String[] args) {
			
					float r1,x1,x=925.583f,r2,y1,y=725.583f;
					
					x1 = x * 1000;// 25.583 * 1000----25583
					r1 = x1 % 1000;// 25583 % 1000---583
					
					y1= y * 1000;
					r2 = y1 % 1000;// 589
					if(r1 == r2) {
						System.out.println("they are same");
					}
					else {
						System.out.println("not same");
					}
					
					
					
							System.out.println("Program Ends");
				}

			
		}
			

			
			   	



