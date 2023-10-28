package loops;
/*{
String[] names= {"jay","yash","naved","bill"};
System.out.println(names[0]);
System.out.println(names[1]);
System.out.println(names[2]);
System.out.println(names[3]);
*/

public class Enhanced_For_Loop_stmt {

	public static void main(String[] args) {
			
		String[] names= {"jay","yash","naved","bill"};
		for(int index=0;index<=3;index++)
		{
			System.out.println(names[index]);
		}
		System.out.println("-----------------------");
		for(String name:names) {                         //using for(:)
			System.out.println("hi "+name);
		}
			
	}
}


