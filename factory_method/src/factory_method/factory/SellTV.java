package factory_method.factory;

public class SellTV implements Product{

	@Override
	public String showInfo() {
		return "TV is sold";
	}
}
