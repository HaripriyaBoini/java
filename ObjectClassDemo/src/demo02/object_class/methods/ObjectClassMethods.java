package demo02.object_class.methods;

public class ObjectClassMethods {

	public static void main(String[] args) {
		Product product1 = new Product(101,"TV");
				System.out.println(product1.getClass());
				System.out.println(product1.getClass().getPackageName());
				System.out.println(product1.getClass().getName());
				
				Product product2=new Product();
				Product product3= product2;
				
				System.out.println(product1.hashCode());  //system.out.println(product1);
				System.out.println(product2.hashCode());
				System.out.println(product3.hashCode());
				
				System.out.println(product1);
				System.out.println(product2);
				
				Product product4 = new Product(101,"TV");
				System.out.println(product1.equals(product4));
				
	}

}
