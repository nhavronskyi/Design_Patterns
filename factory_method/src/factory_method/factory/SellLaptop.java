package factory_method.factory;

public class SellLaptop implements Product{
	
	@Override
	public String showInfo() {
		return "Laptop is sold";
	}
}
