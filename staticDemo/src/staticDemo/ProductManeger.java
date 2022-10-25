package staticDemo;

public class ProductManeger {
	
	protected void add(Product product) {
		ProductValidator validator = new ProductValidator();

		if (validator.isValid(product)) {
			System.out.println("Eklendi");

		} else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}
	}
}