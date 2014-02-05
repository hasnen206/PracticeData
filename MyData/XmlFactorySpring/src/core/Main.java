package core;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Main {

	
	public static void main(String[] args) {
	XmlBeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("dynamic.xml"));
	Oracle o=(Oracle)beanFactory.getBean("oracle");
	System.out.println("The value is "+ o.define());
	}

}
