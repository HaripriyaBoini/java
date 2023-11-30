package jump;

public class Break_In_NestedForLoop {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5;j++) {
				if(i==2&&j==2) {
					break;
					
				}System.out.println(+i+""+j);
			}System.out.println("outside inner loop");
		}System.out.println("outside outer loop");
	}

}
