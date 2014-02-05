package pojos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDetails {
	
	private String username;
	private String password;
	
	@Autowired
	private BookingDetails bookingDetails;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) 
	{ //System.out.println("POJo");
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public BookingDetails getBookingDetails() {
		return bookingDetails;
	}
	public void setBookingDetails(BookingDetails bookingDetails) {
		this.bookingDetails = bookingDetails;
	}
	@Override
	public String toString() {
		return "UserDetails [username=" + username + ", password=" + password
				+ ", bookingDetails=" + bookingDetails + "]";
	}
	
	

}
