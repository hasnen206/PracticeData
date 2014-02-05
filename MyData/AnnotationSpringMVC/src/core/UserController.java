package core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import pojo.User;

@Controller
@RequestMapping(value="/userannonation.htm")
@SessionAttributes("user")
public class UserController {

	public UserController() {
	}
@Autowired
UserService us;

 @RequestMapping(method=RequestMethod.GET)
	public String userForm(ModelMap m){
	User user=new User();
	user.setUsername("Temp");
	m.addAttribute(user);
	return "UserForm";
		
	}
 
 @RequestMapping(method=RequestMethod.POST)
 public String showOnSubmit(@ModelAttribute("user") User user) throws Exception{
	 //us.getUser(user.getUsername(),user.getPassword());
	 us.persist(user);
	 return "redirect:success.htm";
 }
}
