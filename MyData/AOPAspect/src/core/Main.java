package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Basic basicImpl=(Basic)context.getBean("basicImpl");
		System.out.println(basicImpl.getBefore(" Called After Before Advice"));
		System.out.println(basicImpl.getAround());
		basicImpl.getAfter();
	}

}
