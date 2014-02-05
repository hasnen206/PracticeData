package core;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import pojo.User;

public class UserController extends SimpleFormController {

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
		us.persist();
		return new ModelAndView("Success","key",u);
	}
}
