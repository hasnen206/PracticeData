package core;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) throws IOException {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Product product1=(Product)context.getBean("a");
		Product product2=(Product)context.getBean("cd");
		Product product3=(Product)context.getBean("dvd");
		ShoppingCart cart=(ShoppingCart)context.getBean("shoppingCart");
		Cashier cashier=(Cashier)context.getBean("cashier");
		cart.addItem(product1);
		cart.addItem(product2);
		cart.addItem(product3);
		cashier.checkout(cart);
		ShoppingCart cart1=(ShoppingCart)context.getBean("shoppingCart");
		cart1.addItem(product1);
		cart1.addItem(product2);
		cashier.checkout(cart1);
		context.registerShutdownHook();

	}

}
