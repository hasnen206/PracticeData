package core;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* core.*.operate(..))")
	public void logMethod(JoinPoint jp){
		System.out.println("AOP logging "+ jp.toShortString());
	}
	
}
