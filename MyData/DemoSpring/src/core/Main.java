package core;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class Main {

	
	public static void main(String[] args) {
		DefaultListableBeanFactory bf=new DefaultListableBeanFactory();
		BeanDefinitionReader br=new PropertiesBeanDefinitionReader(bf);
		br.loadBeanDefinitions(new ClassPathResource("bean.properties"));		
		MessageSource ms=(MessageSource)bf.getBean("source");
		MessageDestination md=(MessageDestination)bf.getBean("destination");
		
		md.write(ms.getMessage());
	}

}
