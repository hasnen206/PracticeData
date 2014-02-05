package com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jdbc.conn.ConnectionFactory;
import com.jdbc.pojo.Dept;

public class DeptDaoImpl implements DeptDAO {

	ConnectionFactory factory = null;
	Connection connection = null;
	ResultSet resultSet = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;

	public DeptDaoImpl() throws SQLException, ClassNotFoundException {
		factory = new ConnectionFactory();
		connection = factory.getConnectionType4();
		statement = connection.createStatement(
				ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
	}

	@Override
	public int getMaxDeptno() {
		int deptno = 0;
		try {
			resultSet = statement.executeQuery("SELECT MAX(DEPTNO) FROM DEPT");
			resultSet.next();
			deptno = resultSet.getInt(1);
			resultSet.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deptno;
	}

	@Override
	public void addNewDept(Dept dept) {
		try {
			resultSet = statement.executeQuery("SELECT * FROM DEPT");
			resultSet.moveToInsertRow();
			resultSet.updateInt("deptno", dept.getDeptno());
			resultSet.updateString("dname", dept.getDname());
			resultSet.updateString("loc", dept.getLoc());
			resultSet.insertRow();
			resultSet.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateDeptName(int deptno, String dname) {
		try {
			resultSet = statement
					.executeQuery("SELECT DNAME FROM DEPT WHERE DEPTNO="
							+ deptno);
			resultSet.next();
			resultSet.updateString("dname", dname);
			resultSet.updateRow();
			resultSet.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteDept(int deptno) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Dept> getDeptList() {
		ArrayList<Dept> deptList = null;
		try {
			resultSet = statement.executeQuery("SELECT * FROM DEPT");
			deptList = new ArrayList<>();
			while (resultSet.next()) {
				deptList.add(new Dept(resultSet.getInt("deptno"), resultSet
						.getString("dname"), resultSet.getString("loc")));
			}
			resultSet.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deptList;
	}

}
