package jump;

public class Labeled_Break {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			System.out.println("\n i="+i);
		}
		one:
			for(int j=1;j<=3;j++)
			{
				if(j==2)
					break one;                  //the labels will break only if there is a break stmt
				System.out.println("j="+j);
			}
	}

}
