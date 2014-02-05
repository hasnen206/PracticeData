package stringassignments;


import java.util.*;

public class EmailCheck {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your email");
		String email = input.next();
		validate(email);
		input.close();
	}
	
	private static void validate(String email) {

		if (email.matches("[A-Za-z0-9_]+@[A-Za-z0-9]+.com")) {
			System.out.println("Valid email id");
		} else
			System.out.println("Invalid Email");
	}
  }

	
	

