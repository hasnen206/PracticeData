package database;

import imarticuspojo.MyImarticus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.catalina.connector.Request;


public class ImarticusImpl {
	public boolean isValidUser(String username,String password)
	{
		try {
			ConnectionFactory factory=new ConnectionFactory();
			Connection connection=factory.getConnectionType4();
			String query="SELECT * FROM IMARTICUS WHERE USERNAME=? AND PASSWORD=?";
			PreparedStatement preparedStatement= connection.prepareStatement(query); 
			
			preparedStatement.setString(1,username);
			preparedStatement.setString(2,password);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet!=null)
			{
				return true;
			}
			
			resultSet.close();
			preparedStatement.close();
			connection.close();
			factory.closeConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	public int addStudent(MyImarticus smartycus){
		int row=0;
		MyImarticus im=new MyImarticus();
		try {
			ConnectionFactory factory=new ConnectionFactory();
			Connection connection=factory.getConnectionType4();
			String query="INSERT INTO VALUES(?,?,?,?,?,?)";
			PreparedStatement preparedStatement= connection.prepareStatement(query);
			preparedStatement.setString(1,im.getUsername());
			preparedStatement.setString(2,im.getPassword());
			preparedStatement.setDate(3,im.getDate());
			preparedStatement.setString(4,im.getAddress());
			preparedStatement.setString(5,im.getGender());
			preparedStatement.setString(6,im.getHobbies());
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
}
