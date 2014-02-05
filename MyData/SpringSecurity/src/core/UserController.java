package core;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/welcome")
public class UserController {
	@RequestMapping(method=RequestMethod.GET)
	public String printWelcome(ModelMap model) throws Exception{
		model.addAttribute("message","Hello User");
		return "Hello";
	}

}
