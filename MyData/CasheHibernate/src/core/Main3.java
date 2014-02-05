package core;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main3 {

	
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session1=factory.openSession();
		session1.beginTransaction();
		
		Query query=session1.createQuery("from UserDetails u where u.id=1");
		query.setCacheable(true);
		List l1=query.list();
		System.out.println(l1.size());
		session1.getTransaction().commit();
		session1.flush();
		session1.close();
		Session session2=factory.openSession();
		session2.beginTransaction();
		Query query2=session2.createQuery("from UserDetails u where u.id=1");
		query2.setCacheable(true);
		List l2=query2.list();
		System.out.println(l2.size());
		session2.getTransaction().commit();
		session2.flush();
		session2.close();
		
		
		HibernateUtil.shutdown();


	}

}
