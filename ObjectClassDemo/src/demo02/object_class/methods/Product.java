package demo02.object_class.methods;

public class Product {
	private int id;
	private String name;
	public Product() {
		super();
		
	}
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj)   {//0bj~product4,product1~this
		Product p = (Product)obj;
		return this.id==p.id&&this.name.equals(p.name);
	}
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	

}
