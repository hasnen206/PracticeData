package core;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.SimpleFormController;

import pojo.User;


public class UserController extends SimpleFormController{

UserService us;
	
	public UserService getUs() {
		return us;
	}
	public void setUs(UserService us) {
		this.us = us;
	}
	public UserController(){
		setCommandClass(User.class);
		setCommandName("POJO");
	}
	@Override
	public ModelAndView onSubmit(Object p)throws Exception{
		User u=(User)p;
		String type=us.getUser(u.getUsername(),u.getPassword());
		if(type.equals("VALID")){
		return new ModelAndView("Success","key",u);
		}
		else{
			return new ModelAndView("Retry","key",u.getUsername());
		}
	}
}
