package methods;

public class SumofNumber {
	public static void main(String[] args) {
		// 982
		// 9+8+2----19---1+9-----10---1+0---1
		int num =245,r,sum=0;
		while(true) {
			r = num % 10;// 1 % 10----1
			num = num / 10;//1 / 10 --- 0
			sum = sum + r;//0+0+1
			if(num == 0) {
				if(sum > 9) {// 1 > 9
					num = sum;
					sum =0;
				}	
				else {
					break;
				}
			}
		}
		System.out.println(sum);// 1
	}


}
