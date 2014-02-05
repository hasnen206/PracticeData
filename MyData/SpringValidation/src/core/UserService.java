package core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionFactory;

public class UserService {

	public String getUser(String name,String password){
		String uname="INVALID";
	
			try {
				ConnectionFactory factory = new ConnectionFactory();
				Connection connection = factory.getConnectionType4();
				String query="SELECT TYPE FROM EMP WHERE USERNAME=? AND PASSWORD=?";
				PreparedStatement preparedStatement=connection.prepareStatement(query);
				preparedStatement.setString(1,name);
				preparedStatement.setString(2,password);
				ResultSet resultSet=preparedStatement.executeQuery();
				while(resultSet.next()){
				uname=resultSet.getString("TYPE");
				}
				resultSet.close();
				preparedStatement.close();
				connection.close();
				factory.closeConnection();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return uname;
		
	}
	
}
