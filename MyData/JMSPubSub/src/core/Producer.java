package core;

import java.util.Properties;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Producer {

	public static Context getInitialContext() throws NamingException{
		Properties p=new Properties();
		p.setProperty("java.naming.factory.initial","org.jnp.interfaces.NamingContextFactory");
		p.setProperty("java.naming.factory.url.pkgs","org.jboss.naming");
		p.setProperty("java.naming.provider.url","localhost:1099");
		
			Context ctx=(Context) new InitialContext(p);
		return ctx;
		
	}
	public void start() throws JMSException, NamingException{
		Context ctx=getInitialContext();
		TopicConnectionFactory tcf=(TopicConnectionFactory)ctx.lookup("ConnectionFactory");
		Topic t=(Topic) ctx.lookup("topic/i_jms");
		TopicConnection tconn=tcf.createTopicConnection();
		TopicSession tses=tconn.createTopicSession(false,Session.AUTO_ACKNOWLEDGE);
		TopicPublisher tpub=tses.createPublisher(t);
		tconn.start();
		for(int i=0;i<10;i++){
			Producer.sendMessage("Message= "+i, tses,tpub);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		tpub.close();
	}
	
	public static void sendMessage(String m,TopicSession tses,TopicPublisher tpub){
		try {
			TextMessage tm=tses.createTextMessage(m);
			tpub.publish(tm);
			
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		Producer producer=new Producer();
		try {
			producer.start();
		} catch (JMSException | NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
