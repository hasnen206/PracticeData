package controllers;

import javax.xml.ws.BindingType;
import javax.xml.ws.http.HTTPBinding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import database.QueryHandler;
import pojos.UserDetails;

@Controller
@RequestMapping(value="/login.htm")
@SessionAttributes(value="userdetails")
@BindingType(value = HTTPBinding.HTTP_BINDING)  
public class LoginController {
	
	public LoginController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	QueryHandler handler;

	@RequestMapping(method=RequestMethod.GET)
	public String userForm(ModelMap m){
		UserDetails user=new UserDetails();
		//user.setUserName("userName");
		//user.setPassword("password");
		//m.addAttribute(user);
		m.addAttribute("userdetails",user);
		System.out.println("In USERFORM");
		return "Login";
	
	}
	  
	@RequestMapping(method=RequestMethod.POST)
	 public String showOnSubmit(@ModelAttribute("userdetails")UserDetails details) throws Exception{
		System.out.println("In OnSubmit");
		return "Success";
	 }

}

