package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private Connection connection=null;
	
	public void loadDriver(String driverName) throws ClassNotFoundException
	{
		
			Class.forName(driverName);
		
	}
	
	public Connection getConnectionType1() throws SQLException,ClassNotFoundException{
	
		loadDriver("sun.jdbc.odbc.JdbcOdbcDriver");
		connection =DriverManager.getConnection("jdbc:odbc:javadb","system","manager");
		return connection;
	}
	
	public Connection getConnectionType4() throws ClassNotFoundException, SQLException{
		loadDriver("oracle.jdbc.OracleDriver");
		connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
		return connection;
			}
	
	public void closeConnection() throws SQLException{
	if(connection!=null)
	{
		connection.close();
	}
		
	}
}
