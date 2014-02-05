package com.imarticus.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ReflectionDemo {
public static void main(String[] args) {
	
	try {
		Class details=Class.forName("com.imarticus.bank.BankAccount");
		String nameOfClass=details.getName();
		Field[]fields=details.getDeclaredFields();
		Constructor []constructors=details.getConstructors();
		Method []methods=details.getDeclaredMethods();
		//System.out.println(nameOfClass);
		for(Field field:fields)
		{
			System.out.println(field.getName());
			System.out.println(field.getModifiers());
		}
		for(Method method:methods){
			//method.setAccessible(true);
			
			System.out.println(method.getGenericParameterTypes());
		}
		for(Constructor constructor:constructors){
			System.out.println(constructor.getName());
			System.out.println(constructor.getDeclaringClass());
		}
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
}
}
