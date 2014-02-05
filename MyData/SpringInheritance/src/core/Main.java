package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	PersonSalary salary=(PersonSalary)context.getBean("personsal");
	PersonAddress address=(PersonAddress)context.getBean("personadd");

	System.out.println(salary);
	System.out.println(address);
	

	}

}
