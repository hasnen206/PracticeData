package core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

	
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		Address address1=new Address();
		address1.setaId(1);
		address1.setCity("MUMBAI");
		address1.setState("MAH");
		
		Address address2=new Address();
		address2.setaId(2);
		address2.setCity("KOL");
		address2.setState("WB");
		
		Student student1=new Student();
		student1.setsId(1);
		student1.setsName("HASNEN");
		student1.setsAddress(address1);
		
		Student student2=new Student();
		student2.setsId(2);
		student2.setsName("RAAJ");
		student2.setsAddress(address2);
		
		session.save(student1);
		session.save(student2);
		
		session.getTransaction().commit();
		session.flush();
		session.close();
		HibernateUtil.shutdown();

	}

}
