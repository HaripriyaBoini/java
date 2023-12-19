package Assignments_of_ContrlStmts;

/*
 * Given length and breadth of a rectangle
 *  write a program to find whether the area of rectangle is greater than its perimeter
 *  INPUT:
 *  5 3
 *  OUTPUT:
 *  Area:15
 *  Perimeter:16
 *  Perimeter is greater than area
 */

public class AreaofRectangle_greaterto_perimeter {        

	public static void main(String[] args) {
		int length=5;
		int breadth=3;
		int area_of_rectangle=length*breadth;
		System.out.println("area of rectangle"+area_of_rectangle);
		int perimeter_of_rectangle=2*(area_of_rectangle);
		System.out.println("perimeter_of_rectangle"+perimeter_of_rectangle);

		int p=perimeter_of_rectangle;
		int a=area_of_rectangle;
		if(p>a)
			System.out.println("perimeter is greater than area");
		else
			System.out.println("area is greater than perimeter");
			
			
			

	}

}
