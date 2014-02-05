package core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueReceiver;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

;

public class CommanLineChat implements MessageListener{
	public static Context getInitialContext() throws NamingException{
		Properties p=new Properties();
		p.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		p.setProperty("java.naming.factory.url.pkgs", "org.jboss.naming");
		p.setProperty("java.naming.provider.url", "localhost:1099");
		Context ctx=new InitialContext(p);
		return ctx;
	}
	@Override
	public void onMessage(Message arg0) {	
	try {
		String x = ((TextMessage)arg0).getText();
		System.out.println("Message in OnMessage"+x);
	} catch (JMSException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	
	public void start(String s[]) throws NamingException, JMSException, IOException{
		if(s.length!=3){
			System.out.println("username subscribe_to publish_to");
		}
		else 
		{
			String name=s[0];
			String subQ="queue/"+s[1];
			String pubQ="queue/"+s[2];
			Context ctx=getInitialContext();
			QueueConnectionFactory qcf=(QueueConnectionFactory)ctx.lookup("ConnectionFactory");
			Queue q1=(Queue)ctx.lookup(subQ);
			Queue q2=(Queue)ctx.lookup(pubQ);
			QueueConnection qconn=qcf.createQueueConnection();
			CommanLineChat.subscribe(qconn, q1, new CommanLineChat());
			CommanLineChat.publish(qconn, q2, name);
	
			
		}
		
		
			
		}
	
	public static void subscribe(QueueConnection qcon,Queue q, CommanLineChat c) throws JMSException{
		QueueSession qses=qcon.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
		QueueReceiver qrec=qses.createReceiver(q);
		qrec.setMessageListener(c);
	}
	
	public static void publish(QueueConnection qcon,Queue q,String name) throws JMSException, IOException{
		String ms=null;
		QueueSession qses=qcon.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
		QueueSender qsend=qses.createSender(q);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		qcon.start();
		while(true){
			ms=br.readLine();
			TextMessage tm=qses.createTextMessage();
			tm.setText(" [ "+name+" say "+ms);
			qsend.send(tm);
		}		
		
	}
	public static void main(String args[]) throws NamingException, JMSException, IOException{
		CommanLineChat con=new CommanLineChat();
		con.start(args);
	}
	
	

}
