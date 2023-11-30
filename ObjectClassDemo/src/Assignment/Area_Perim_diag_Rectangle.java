package Assignment;

public class Area_Perim_diag_Rectangle {
	
	static int length=4;
	static int breadth=3;
	int area;
	
	public void Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void setLength(int length)
	{
		this.length=length;
	}
	public void setBreadth(int breadth) {
		this.breadth=breadth;
	}
	public int getLength() {
		return length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void  PrintArea() {
		System.out.println("Area of rectangle is"+length*breadth);
		
	}
	
	public void printPerimeter() {
		double Perimeter = 2*(length*breadth);
		System.out.println("perimeter of a rect is"+Perimeter);
		
	}
	public static void PrintDiagonal() {
		double diagonal =Math.sqrt((length*length)+(breadth*breadth));
		System.out.println(diagonal+"is diagonal of rect");
	}
	
	
	public static void main(String[] args) {
		//length=4,breadth=3;
		
		 Area_Perim_diag_Rectangle apdr = new Area_Perim_diag_Rectangle();
		 apdr.PrintArea();
		 apdr.setLength(5);
		 apdr.printPerimeter();
		 apdr.setBreadth(4);
		 apdr.getBreadth();
		 apdr.PrintDiagonal();
		 
		
	}

		// TODO Auto-generated method stub
		
	

}
