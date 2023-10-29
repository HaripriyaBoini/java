package jump;

public class Continue_Labelled_Loop {

	public static void main(String[] args) {
		aa:
			for(int i=1;i<=3;i++) {
				bb:
			for(int j=1;j<=3;j++) {
				if(i==2&&j==2)
					continue aa;
			System.out.println(+i+""+j);       // a label can break label untill it has break stmt
				}
				System.out.println("outside outer Loop");
		}
		System.out.println("outside outer Loop");
	}

}
