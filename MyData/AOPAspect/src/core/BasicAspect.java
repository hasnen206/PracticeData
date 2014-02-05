package core;

import org.aspectj.lang.ProceedingJoinPoint;

public class BasicAspect {

	public void beforeMethod(){
		System.out.println("Called Before Advice");
	}
	public void afterMethod(){
		System.out.println("After Advice Called");
	}
	public Object aroundMethod(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("In Around Advice");
		Object op=jp.proceed();
		String methodName=jp.getSignature().getName();
		if("getBefore".equals(methodName)){
			return "Wow this is new in Around Advice";
		}
		else if("getAround".equals(methodName)){
			return 50L;
		}
		return methodName;
	}
}
