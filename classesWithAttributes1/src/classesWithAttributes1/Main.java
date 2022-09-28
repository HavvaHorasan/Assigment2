package classesWithAttributes1;

public class Main {

	public static void main(String[] args) {
		Product product= new Product(1,"Laptop","HP Laptop", 5700, 3,"Beyaz");
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("HP Laptop");
//		product.setPrice(5700);
//		product.setStockAmount(3);
		
		
		ProductManager productManager= new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
		
		
	}

}
