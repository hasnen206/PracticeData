package com.jdbc.pojo;

import java.sql.Date;
import java.util.ArrayList;

import com.jdbc.dao.EmpDAO;

public class Employee {

	private int empno;
	private String ename;
	private String job;
	private double sal;
	private double comm;
	private Date hiredate;
	private int mgr;
	private int deptno;
	
	
	public int getEmpno() {
		return empno;
	}


	public void setEmpno(int empno) {
		this.empno = empno;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public double getSal() {
		return sal;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}


	public double getComm() {
		return comm;
	}


	public void setComm(double comm) {
		this.comm = comm;
	}


	public Date getHiredate() {
		return hiredate;
	}


	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}


	public int getMgr() {
		return mgr;
	}


	public void setMgr(int mgr) {
		this.mgr = mgr;
	}


	public int getDeptno() {
		return deptno;
	}


	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public Employee()
	{
		
	}
	

	public Employee(int empno, String ename, String job, double sal,
			double comm, Date hiredate, int mgr, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.comm = comm;
		this.hiredate = hiredate;
		this.mgr = mgr;
		this.deptno = deptno;
	}


	
}
