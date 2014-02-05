package core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

	
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		Course1 course1=new Course1();
		course1.setCourseId(1);
		course1.setCourseName("Java");
		session.save(course1);
		session.getTransaction().commit();
		session.flush();
		session.close();
		HibernateUtil.shutdown();

	}

}
