package core;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

	
	public static void main(String[] args) {
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		Set<Course> c1=new HashSet<>();
		c1.add(new Course("maths"));
		c1.add(new Course("Chemistry"));
		Participant p1=new Participant("A",c1);
		Participant p2=new Participant("B",c1);
		session.save(p1);
		session.save(p2);
		session.getTransaction().commit();
		session.flush();
		session.close();
		HibernateUtil.shutdown();
	}

}
