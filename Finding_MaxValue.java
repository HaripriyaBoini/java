package methods;

public class Finding_MaxValue {
static int  findMax(int x,int y,int z){
		
		if ( (x>y) && (x>z)) {               //1 2 3
			return x;                         
		}
		else if(y>z) {
			return y;
		}
		else {
			return z;
		}
	}
	public static void main(String[] args) {
		int a=1,b=2,c=3;
		System.out.println("Max Value--->"+findMax(a,b,c));
		
		
	}
}

