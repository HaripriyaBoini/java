package demo5.realexamples;

public class RightTriangle extends Figure {
	

	public RightTriangle() {
		super();
		
	}

	public RightTriangle(int base, int height) {
		super(base, height);
		
	}

	@Override
	int calculateArea() {
		return (getProduct()/2);
	}

}
