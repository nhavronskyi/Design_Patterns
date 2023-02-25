package factory_method.factory;

public class Laptop implements Seller{
	private int counterOfProducts;
	
	public Laptop(int counterOfProducts) {
		this.counterOfProducts = counterOfProducts;
	}
	
	@Override
	public Product sellProduct() {
		if(counterOfProducts == 0)
			return new EmptyStorage("Laptop");
		counterOfProducts--;
		return new SellLaptop();
	}
}
