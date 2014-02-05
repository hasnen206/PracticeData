package core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	
	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session1=factory.openSession();
		session1.beginTransaction();
		
		
		UserDetails details=new UserDetails();
		details.setId(1);
		details.setUsername("Venkat");
		session1.save(details);
		details=(UserDetails) session1.get(UserDetails.class,1);
		UserDetails details2=(UserDetails) session1.get(UserDetails.class,1);
		details2.setUsername("Hasnen");
		System.out.println("details2 " +details2.getUsername() );
		//level...2
		Session session2=factory.openSession();
		UserDetails details3=(UserDetails) session2.get(UserDetails.class,1);
		System.out.println("details3 " +details3.getUsername() );
		
		
		
		
		session1.getTransaction().commit();
		session1.flush();
		session1.close();
		HibernateUtil.shutdown();

	}

}
