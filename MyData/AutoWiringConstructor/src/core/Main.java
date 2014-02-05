package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		College college=(College)context.getBean("college");
		System.out.println(college);

	}

}
