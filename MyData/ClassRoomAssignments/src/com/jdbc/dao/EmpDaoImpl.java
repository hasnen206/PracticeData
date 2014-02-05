package com.jdbc.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jdbc.conn.ConnectionFactory;
import com.jdbc.pojo.Employee;

public class EmpDaoImpl implements EmpDAO {

	
	
	@Override
	public ArrayList<Employee> getEmployeeList() {
		ArrayList<Employee> empList = null;
		try {
			empList = null;
			ConnectionFactory factory=new ConnectionFactory();
			Connection connection=factory.getConnectionType4();
			java.sql.Statement statement=connection.createStatement();
			String query="SELECT * FROM EMP";
			ResultSet resultset= statement.executeQuery(query);
			empList=new ArrayList<>();
			while(resultset.next()){
				empList.add(new Employee(resultset.getInt("empno"),resultset.getString("ename"),resultset.getString("job"),resultset.getDouble("sal"),resultset.getDouble("comm"),resultset.getDate("hiredate"),resultset.getInt("mgr"),resultset.getInt("deptno")));
			}
			resultset.close();
			statement.close();
			connection.close();
			factory.closeConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
	}

	@Override
	public String getEmployeeName(int empNo) {
		String name=null;
		try{
		ConnectionFactory factory=new ConnectionFactory();
		Connection connection=factory.getConnectionType4();
		String query="SELECT ENAME FROM EMP WHERE EMPNO=?";
		PreparedStatement preparedStatement= connection.prepareStatement(query);
		ResultSet resultset= preparedStatement.executeQuery(query);
		preparedStatement.setInt(1,empNo);
		resultset.next();
		name=resultset.getString(empNo);
		
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
	public Employee getEmployeeDetails(int empNo) {
		Employee emp=null;
		ConnectionFactory factory=new ConnectionFactory();
		try {
			Connection connection=factory.getConnectionType4();
			String query="SELECT * FROM EMP WHERE EMPNO=?";
			PreparedStatement preparedStatement= connection.prepareStatement(query); 
			ResultSet resultset=preparedStatement.executeQuery();
			preparedStatement.setInt(1,empNo);
			
				emp=new Employee(resultset.getInt("empno"),resultset.getString("ename"),resultset.getString("job"),resultset.getDouble("sal"),resultset.getDouble("comm"),resultset.getDate("hiredate"),resultset.getInt("mgr"),resultset.getInt("deptno"));
			
			preparedStatement.close();
			connection.close();
			factory.closeConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
		
	}

	@Override
	public int addNewEmployee(Employee employee) {
		int row=0;
		try {
			
			ConnectionFactory factory=new ConnectionFactory();
			Connection connection=factory.getConnectionType4();
			String query="INSERT INTO emp VALUES(?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement= connection.prepareStatement(query);
			preparedStatement.setInt(1,employee.getEmpno());
			preparedStatement.setString(2,employee.getEname());
			preparedStatement.setString(3,employee.getJob());
			preparedStatement.setDouble(4,employee.getSal());
			preparedStatement.setDouble(5,employee.getComm());
			preparedStatement.setDate(6,employee.getHiredate());
			preparedStatement.setInt(7,employee.getMgr());
			preparedStatement.setInt(8,employee.getDeptno());
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
	public int removeEmployee(int empno) {
		int row=0;
		ConnectionFactory factory=new ConnectionFactory();
		try {
			Connection connection=factory.getConnectionType4();
			String query="DELETE FROM EMP WHERE EMPNO=?";
			PreparedStatement preparedStatement= connection.prepareStatement(query); 
			
			preparedStatement.setInt(1,empno);
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
	public int updateEmployeeSalary(int empno, double sal) {
		
		int row=0;
		ConnectionFactory factory=new ConnectionFactory();
		try {
			Connection connection=factory.getConnectionType4();
			String query="UPDATE EMP SET SAL=SAL+? WHERE EMPNO=?";
			PreparedStatement preparedStatement= connection.prepareStatement(query); 
			preparedStatement.setDouble(1,sal);
			preparedStatement.setInt(2,empno);
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

	public boolean isValidUser(int userid,String username)
	{
		try {
			ConnectionFactory factory=new ConnectionFactory();
			Connection connection=factory.getConnectionType4();
			String query="SELECT FROM EMP WHERE EMPID=? AND ENAME=?";
			PreparedStatement preparedStatement= connection.prepareStatement(query); 
			
			preparedStatement.setInt(1,userid);
			preparedStatement.setString(2,username);
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

	

}
