package core;
import java.util.Properties;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;





public class Consumer implements javax.jms.MessageListener{

	public static Context getInitialContext() throws NamingException{
		Properties p=new Properties();
		p.setProperty("java.naming.factory.initial","org.jnp.interfaces.NamingContextFactory");
		p.setProperty("java.naming.factory.url.pkgs","org.jboss.naming");
		p.setProperty("java.naming.provider.url","localhost:1099");
		
			Context ctx=(Context) new InitialContext(p);
		return ctx;
		
	}
	
	@Override
	public void onMessage(Message m) {
		try {
			String x=((TextMessage)m).getText();
			System.out.println(x);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void start() throws NamingException, JMSException{
		Context ctx=getInitialContext();
		TopicConnectionFactory tcf=(TopicConnectionFactory)ctx.lookup("ConnectionFactory");
		Topic t=(Topic) ctx.lookup("topic/i_jms");
		TopicConnection tconn=tcf.createTopicConnection();
		TopicSession tses=tconn.createTopicSession(false,Session.AUTO_ACKNOWLEDGE);
		TopicSubscriber tsub=tses.createSubscriber(t);
		tsub.setMessageListener(new Consumer());
		tconn.start();
		System.out.println("Started");
	}

	public static void main(String[] args) {
	 Consumer consumer=new Consumer();
	 try {
		consumer.start();
	} catch (NamingException | JMSException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
