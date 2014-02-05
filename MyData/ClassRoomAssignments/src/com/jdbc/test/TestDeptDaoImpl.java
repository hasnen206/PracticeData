package com.jdbc.test;

import java.sql.SQLException;

import com.jdbc.dao.DeptDAO;
import com.jdbc.dao.DeptDaoImpl;
import com.jdbc.pojo.Dept;

public class TestDeptDaoImpl {
	public static void main(String[] args) {
		try {
			DeptDAO dept= new DeptDaoImpl();
			for(Dept value:dept.getDeptList()){
				System.out.println(value);
			}
			
			dept.updateDeptName(30, "HR");
			
			for(Dept value:dept.getDeptList()){
				System.out.println(value);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
