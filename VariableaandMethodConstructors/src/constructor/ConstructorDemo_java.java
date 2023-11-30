package constructor;

public class ConstructorDemo_java {

	public static void main(String[] args) {
		
			Box matchBox=new Box();
			System.out.println(matchBox.length);
			System.out.println(matchBox.width);
			System.out.println(matchBox.height);
			
			Box shoeBox=new Box(6,5,4);   //if we dont give parameters also it works like it takes default values
				System.out.println(shoeBox.length);
				System.out.println(shoeBox.width);
				System.out.println(shoeBox.height);
				
				Box squareBox=new Box(5,5,5);
				System.out.println(squareBox.length);
				System.out.println(squareBox.width);
				System.out.println(squareBox.height);
				
				
				
				
	}

}
