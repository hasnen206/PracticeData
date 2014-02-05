package core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

	
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Contact contact=new Contact();
		contact.setId(1);
		contact.setFname("Hasnen");
		contact.setLname("Dawood");
		session.beginTransaction();
		session.save(contact);
		session.getTransaction().commit();
		session.flush();
		session.close();
		
//		HibernateUtil.shutdown();

	}

}
