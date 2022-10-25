package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManeger manager = new ProductManeger();
		Product product = new Product();
		product.price = 10;
		product.name = "Mause";
		
		manager.add(product);
	}

}
