package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Context.xml");
		MySpringBean bean=(MySpringBean)context.getBean("mySpringBean");
		bean.run();
	}

}
