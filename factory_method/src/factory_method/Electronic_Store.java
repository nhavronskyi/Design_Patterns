package factory_method;

import factory_method.factory.Laptop;
import factory_method.factory.Product;
import factory_method.factory.SellTV;
import factory_method.factory.Seller;
import factory_method.factory.TV;

public class Electronic_Store {
	public static void main(String[] args) {
		
		// added elems to storage
		Seller sellTV = new TV(5);
		Seller sellLaptop = new Laptop(5);
		
		// cycle to check electronic seller
		for(int i = 0; i < 7; i++) {
			Product showTV = sellTV.sellProduct();
			System.out.println(showTV.showInfo());
			
			Product showLaptop = sellLaptop.sellProduct();
			System.out.println(showLaptop.showInfo());	
			
			if(showTV.showInfo().startsWith("Storage is Empty") || showLaptop.showInfo().startsWith("Storage is Empty"))
				break;
		}
	}
}
