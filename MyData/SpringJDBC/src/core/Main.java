package core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		StudentJdbcTemplate template=(StudentJdbcTemplate)context.getBean("stujdbc");
		template.create("abc",20);
		
		//System.out.println(template.getStudent(1));
		//template.delete(4);
		List<Student> lists=new ArrayList<>();
		lists=template.ListStudent();
		for(Student student:lists){
		
			System.out.println(student);
		}
		
		//template.updateAge(2,10);
	}

}
