package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Calculate calculate=(Calculate)context.getBean("calculate");
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		calculate.execute(a, b);
		
	}

}
