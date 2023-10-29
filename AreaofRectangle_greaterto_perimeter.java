package Assignments_of_ContrlStmts;

public class AreaofRectangle_greaterto_perimeter {         //Using If-Else stmt

	public static void main(String[] args) {
		int length=5;
		int breadth=3;
		int area_of_rectangle=length*breadth;
		System.out.println("area of rectangle"+area_of_rectangle);
		int perimeter_of_rectangle=2*(area_of_rectangle);
		System.out.println("area_of_rectangle"+area_of_rectangle);

		int p=perimeter_of_rectangle;
		int a=area_of_rectangle;
		if(p>a)
			System.out.println("perimeter is greater than area");
		else
			System.out.println("area is greater than perimeter");
			
			
			

	}

}
