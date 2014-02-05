package core;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import pojo.User;

public class Validate implements Validator {

	private static final int MIN_LENGTH=6;
	public boolean supports(Class<?> arg0) {
		
		return User.class.isAssignableFrom(arg0);
	}

	public void validate(Object p, Errors err) {
		ValidationUtils.rejectIfEmptyOrWhitespace(err, "username","name.req");
		ValidationUtils.rejectIfEmptyOrWhitespace(err, "password","pass.req");
		User u=(User)p;
		if(u.getPassword().length()<MIN_LENGTH){
			err.rejectValue("password","pass.len");
		}
		
	}

}
