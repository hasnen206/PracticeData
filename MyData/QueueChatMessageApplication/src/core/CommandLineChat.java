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



public class CommandLineChat implements MessageListener {

	public static Context getInitialContext() throws NamingException{
		Properties p=new Properties();
		p.setProperty("java.naming.factory.initial","org.jnp.interfaces.NamingContextFactory");
		p.setProperty("java.naming.factory.url.pkgs","org.jboss.naming");
		p.setProperty("java.naming.provider.url","localhost:1099");
		
		Context ctx=(Context) new InitialContext(p);
		return ctx;
	}
	
	public void onMessage(Message m) {
		try {
			System.out.println("In ON MESSAGE");
			String x=((TextMessage)m).getText();
			System.out.println(x);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void start(String s[]) throws JMSException{
		if(s.length!=3)
			System.out.println("username subscribe_to publish_to");
		else{
			String name=s[0];
			String subQ="queue/"+s[1];
			String pubQ="queue/"+s[2];
			try {
				Context ctx=getInitialContext();
				QueueConnectionFactory qcf=(QueueConnectionFactory) ctx.lookup("ConnectionFactory");
				Queue q1=(Queue) ctx.lookup(subQ);
				Queue q2=(Queue) ctx.lookup(pubQ);
				QueueConnection qconn=qcf.createQueueConnection(); 
				CommandLineChat c = new CommandLineChat();
				CommandLineChat.subscribe(qconn, q1, c);
				CommandLineChat.publish(qconn, q2,name);
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void subscribe(QueueConnection qconn,Queue q,CommandLineChat c){
		try {
			QueueSession qsess=qconn.createQueueSession(false,Session.AUTO_ACKNOWLEDGE);
			QueueReceiver qrec=qsess.createReceiver(q);
			qrec.setMessageListener(c);
			System.out.println("entered in subscribe");
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void publish(QueueConnection qconn,Queue q,String name) throws JMSException{
		
		QueueSession qsess=qconn.createQueueSession(false,Session.AUTO_ACKNOWLEDGE);
		QueueSender qsend=qsess.createSender(q);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		qconn.start();
		while(true){
			try {
				String ms=br.readLine();
				TextMessage tm=qsess.createTextMessage();
				tm.setText("["+ name+" says"+ ms+"]");
				qsend.send(tm);
				System.out.println("MESSAGE SENT");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		CommandLineChat chat=new CommandLineChat();
		try {
			chat.start(args);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
