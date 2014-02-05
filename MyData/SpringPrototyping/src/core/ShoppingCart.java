package core;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	List<Product> items=new ArrayList<Product>();
	
	public void addItem(Product product){
		items.add(product);
	}

	public List<Product> getItems() {
		return items;
	}
	
	
}
