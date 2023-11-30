package demo5.realexamples;

public class AbstractDemo {

	public static void main(String[] args) {
		//Figure figure = new Figure(12,12);
		//System.out.println("Area of figure"+figure.calculateArea());
		Figure figure;
		
	figure=new Rectangle(12,12);	
		Rectangle rectangle = new Rectangle(12,12);
		System.out.println("rectangle is a"+Figure.FIGURE_TYPE);
		System.out.println("Area of Reactangle"+Util.calculate(figure));
		
		figure=new RightTriangle(10,50);
		System.out.println("rectangle is a"+Figure.FIGURE_TYPE);
		System.out.println("Area of Right Triangle"+figure.calculateArea());
		
		figure=new Square(10);
		System.out.println("square is a"+Figure.FIGURE_TYPE);
		System.out.println("Area of square"+figure.calculateArea());
		
		
		}

}
