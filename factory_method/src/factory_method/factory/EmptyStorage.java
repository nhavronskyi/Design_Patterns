package factory_method.factory;


// if storage is empty show message
public class EmptyStorage implements Product{
	
	private String product;

	public EmptyStorage(String product) {
		this.product = product;
	}
	
	@Override
	public String showInfo() {
		return "Storage is Empty, product title: " + product;
	}

}
