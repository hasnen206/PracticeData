package com.imarticus.assignments.login;

public class LoginPage {
	
	String name;
	String password;
	public LoginPage(String name,String password)
	{
		this.name=name;
		this.password=password;
	}
	public boolean checkValidation(String name,String password)
	{	
		if(this.name.equals(name) && this.password.equals(password))
			return true;
		else
			return false;
	}
		

	}


