package com.jdbc.dao;

import java.util.ArrayList;

import com.jdbc.pojo.Employee;

public interface EmpDAO {

	public ArrayList<Employee> getEmployeeList();
	public String getEmployeeName(int empNo);
	public Employee getEmployeeDetails(int empNo);
	public int addNewEmployee(Employee employee);
	public int removeEmployee(int empNo);
	public int updateEmployeeSalary(int empNo,double sal);
}
