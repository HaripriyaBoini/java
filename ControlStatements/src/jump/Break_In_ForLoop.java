package jump;

public class Break_In_ForLoop {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i==5) {
				break;
			         }
			System.out.println(+i);
		}
		System.out.println("outside loop");
	}

}
