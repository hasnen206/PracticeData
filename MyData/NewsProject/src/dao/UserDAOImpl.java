package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionFactory;

import pojo.MyUser;

public class UserDAOImpl implements UserDAO {

	ConnectionFactory factory=new ConnectionFactory();
	Connection connection=null;
	PreparedStatement preparedStatement=null;
	ResultSet resultset=null;
	@Override
	public String getUserType(String userName, String password) {
		String name="INVALIDUSER";
		try {
			factory=new ConnectionFactory();
			connection=factory.getConnectionType4();
			
			preparedStatement= connection.prepareStatement("SELECT USERTYPE FROM USERDETAILS WHERE USERNAME=? AND PASSWORD=?");
			
			preparedStatement.setString(1,userName);
			preparedStatement.setString(2,password);
			resultset= preparedStatement.executeQuery();
			resultset.next();
			name=resultset.getString("USERTYPE");
	
			resultset.close();
			preparedStatement.close();
			connection.close();
			factory.closeConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
	}

	@Override
	public int addUser(MyUser newuser) {
		int row=0;
		
		try {
			
			connection=factory.getConnectionType4();
			String query="INSERT INTO USERDETAILS VALUES('?','?','?')";
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1,newuser.getUsername());
			preparedStatement.setString(2,newuser.getPassword());
			preparedStatement.setString(3,newuser.getUsertype());
			row=preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.close();
			factory.closeConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public boolean deleteUser(String userName) {
		int row=0;
		
		try {
			connection=factory.getConnectionType4();
			String query="DELETE FROM USERDETAILS WHERE USERNAME=?";
			PreparedStatement preparedStatement= connection.prepareStatement(query); 
			
			preparedStatement.setString(1,userName);
			row=preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.close();
			factory.closeConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(row!=0){
			return true;
		}
		return false;
		
	}

	@Override
	public boolean updatePassword(String userName, String oldPassword,
			String newPassword) {
		
		return false;
	}

}
