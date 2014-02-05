package com.jdbc.dao;

import java.util.ArrayList;

import com.jdbc.pojo.Dept;

public interface DeptDAO {
	
	public int getMaxDeptno();
	public void addNewDept(Dept dept);
	public void updateDeptName(int deptno, String dname);
	public void deleteDept(int deptno);
	public ArrayList<Dept> getDeptList();

}
