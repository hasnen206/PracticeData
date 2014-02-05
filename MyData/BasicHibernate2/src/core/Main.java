package core;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
	static SessionFactory sf; static Session session;
	Main(){
	sf=HibernateUtil.getSessionFactory();
	session=sf.openSession();
}
	Integer saveCourse(String name){
		Course course=new Course(); 
		course.setCoursename(name);
		Integer i = (Integer) session.save(course);
		return i;
	}
	
	public void listCourse(){
		List courses= session.createQuery("from Course").list();
		for(Iterator i=courses.iterator();i.hasNext();){
			Course course=(Course)i.next();
			System.out.println(course.getCoursename());
			//System.out.println("hello11");

		}
		
	}
	
	public void updateCourse(Integer i,String n){
		Course course=(Course)session.get(Course.class,i);
		course.setCoursename(n);
	}
	
	public void deleteCourse(Integer id){
		Course course=(Course)session.get(Course.class,id);
		session.delete(course);
		System.out.println("Deletion Done");
	}
public static void main(String a[]){
	Main m=new Main();
	session.beginTransaction();
	Integer x1=m.saveCourse("Maths");
	Integer x2=m.saveCourse("Biology");
	Integer x3=m.saveCourse("Physics");
	System.out.println(x1);
	System.out.println(x2);
	System.out.println(x3);
	m.updateCourse(x2, "Chemistry");
	m.deleteCourse(x1);
	session.getTransaction().commit();
	session.flush();
    HibernateUtil.shutdown();
}
}

