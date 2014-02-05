package database;

import org.springframework.stereotype.Component;
import pojos.UserDetails;

@Component
public class QueryHandler {

	public void isValidUser(UserDetails user) {
		System.out.println(user.getUsername());
		
	}

}
