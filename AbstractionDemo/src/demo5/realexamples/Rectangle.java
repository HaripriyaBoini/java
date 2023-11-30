package demo5.realexamples;

public class Rectangle extends Figure{

	public Rectangle(int length, int breadth) {
		super(length, breadth);
	}

	@Override
	int calculateArea() {
		
		return getProduct();
	}
	

}
