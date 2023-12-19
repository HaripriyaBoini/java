
package Assignments_of_ContrlStmts;


/*given three angles of the triangle
 *  write a program to check whether the triangle is valid or not
 *  
 *  NOTE:
     A triangle is valid if the sum of all the three angles is equal to 180 degrees
    INPUT:
     120 60 60
    OUTPUT:
     The triangle is not valid
 */
public class Valid_Triangle {          

	public static void main(String[] args) {
		int side1=120;
		int side2=60;
		int side3=60;
		int validity_of_triangle=side1+side2+side3;
		if(validity_of_triangle==180)
			System.out.println("the triangle is  valid");
		System.out.println("the triangle is not valid");
	}
		}


