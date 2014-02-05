package dao;

import pojo.MyUser;

public interface UserDAO {

	public String getUserType(String userName,String password);
	public int addUser(MyUser newuser);
	public boolean deleteUser(String userName);
	public boolean updatePassword(String userName,String oldPassword,String newPassword);
	
}
