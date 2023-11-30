package demo5.realexamples;

public abstract class Figure {
	public final static String FIGURE_TYPE="2-D FIGURE";
	private int dimension1;
	private int dimension2;
	
	
	
	public Figure() {
		super();
	}
	public Figure(int dimension1, int dimension2) {
		super();
		this.dimension1 = dimension1;
		this.dimension2 = dimension2;
	}
	public int getProduct() {
	return dimension1*dimension2;	
	}
	 abstract int calculateArea();
	
	

}
