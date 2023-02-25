package factory_method.factory;

public class TV implements Seller{
	private int counterOfProducts;
	
	public TV(int counterOfProducts) {
		this.counterOfProducts = counterOfProducts;
	}
	
	@Override
	public Product sellProduct() {
		if(counterOfProducts == 0)
			return new EmptyStorage("TV");
		counterOfProducts--;
		return new SellTV();
	}
}
