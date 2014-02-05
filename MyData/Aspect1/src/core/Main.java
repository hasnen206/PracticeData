package core;

import org.springframework.aop.framework.ProxyFactory;

public class Main {

	
	public static void main(String[] args) {
		ProxyFactory proxyFactory=new ProxyFactory();
		proxyFactory.setTarget(new MessageWriter());
		proxyFactory.addAdvice(new BeforeAspect1());
		proxyFactory.addAdvice(new AfterAspect1());
		MessageWriter writer=(MessageWriter)proxyFactory.getProxy();
		writer.write();
		writer.write1();

	}

}
