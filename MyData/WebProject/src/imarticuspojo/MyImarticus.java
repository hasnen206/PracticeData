package imarticuspojo;

import java.sql.Date;
import java.util.Arrays;

public class MyImarticus {
private String username;
private String password;
private Date date;
private String address;
private String gender;
private String hobbies;

public MyImarticus(){
	
}

public MyImarticus(String username, String password, Date date, String address,
		String gender, String hobbies) {
	super();
	this.username = username;
	this.password = password;
	this.date = date;
	this.address = address;
	this.gender = gender;
	this.hobbies = hobbies;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getHobbies() {
	return hobbies;
}

public void setHobbies(String hobbies) {
	this.hobbies = hobbies;
}

@Override
public String toString() {
	return "MyImarticus [username=" + username + ", password=" + password
			+ ", date=" + date + ", address=" + address + ", gender=" + gender
			+ ", hobbies=" + hobbies + "]";
}

}
