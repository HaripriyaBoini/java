package javaprgm;

public class SumOfEven_SumOfOdd_6 {

	public static void main(String[] args) {
		
			// 1+2+3+4+5+6+7+8+9+10;
				// eSum = 2+4+6+8+10
				// oSum = 1+3+5+7+9
		
				int eSum =0,
				    oSum=0;
				for(int num=100;num<=130;num++) {
					if(num % 2 == 0) {
						eSum = eSum + num;	
					}
					else {
						oSum = oSum +num;	
					}
				}
				System.out.println("Total Even Sum--->"+eSum);
				System.out.println("Total Odd Sum--->"+oSum);


	}

}
