package core;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAspect1 implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println("Called Before "+ arg0.getName());
		
	}

	

}
