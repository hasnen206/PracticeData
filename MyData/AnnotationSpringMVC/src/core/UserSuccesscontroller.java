package core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class UserSuccesscontroller {

	@RequestMapping(value="/success.htm", method=RequestMethod.GET)
	public String finalTest(){
		System.out.println("Second Controller Called");
		return "Success";
	}
}
