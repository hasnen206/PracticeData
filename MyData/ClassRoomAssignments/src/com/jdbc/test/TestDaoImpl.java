package com.jdbc.test;

import com.jdbc.dao.EmpDAO;
import com.jdbc.dao.EmpDaoImpl;
import com.jdbc.pojo.Employee;

public class TestDaoImpl {

	
	public static void main(String[] args) {
		EmpDAO emp=new EmpDaoImpl();
		Employee employee=new Employee();
		
		//for(Employee employee : emp.getEmployeeList()){
			//System.out.println(employee.getEname());
			
			emp.removeEmployee(7934);
			
			
				
				
			}
		}

	


