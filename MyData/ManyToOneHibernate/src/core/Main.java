package core;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		PAddress address1=new PAddress();
		address1.setAddrid(1);
		address1.setCity("MUM");
		address1.setState("MAH");
		Professor professor1=new Professor();
		professor1.setProfid(1);
		professor1.setProfName("AJAY");
		professor1.setpAddress(address1);
		session.save(professor1);
		PAddress address2=new PAddress();
		address2.setAddrid(2);
		address2.setCity("AHM");
		address2.setState("GUJ");
		professor1.setpAddress(address2);
		session.getTransaction().commit();
		session.flush();
		session.close();
		HibernateUtil.shutdown();
	}
}

