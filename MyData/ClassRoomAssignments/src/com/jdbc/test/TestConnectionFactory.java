package com.jdbc.test;

import java.sql.SQLException;

import com.jdbc.conn.ConnectionFactory;

public class TestConnectionFactory {

	public static void main(String[] args) {
		ConnectionFactory factory=new ConnectionFactory();
		
		try {
			System.out.println(factory.getConnectionType1());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println(factory.getConnectionType4());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
