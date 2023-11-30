package demo5.realexamples;

public class Square extends Figure {
	

	public Square() {
		super();
		
	}

	public Square(int side) {
		super(side, side);
		
	}

	@Override
	int calculateArea() {
		return getProduct();
	}

}
