package factory_method.factory;

public class EmptyStorage implements Product{

	@Override
	public String showInfo() {
		return "Storage is Empty";
	}

}
