package comm.imarticus.employee;

import java.util.ArrayList;

public class MyEmployee {
private int empId;
private String empName;
private double sal;
private int deptNo;
ArrayList<MyEmployee> list=new ArrayList<MyEmployee>();

	public MyEmployee(){
	
	}


	public MyEmployee(int empId, String empName, double sal, int deptNo) {
		
		
			this.empId=empId;
		
		this.empName = empName;
		setSal(sal);
		getSal();
		this.deptNo = deptNo;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId=empId;
		
		
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getSal() {
		if(sal<0){
			return sal=0;
		}
		return sal;
	}


	public void setSal(double sal) {
		this.sal = sal;
	}


	public int getDeptNo() {
		return deptNo;
	}


	public void setDeptNo(int deptNo) {
		
			this.deptNo=deptNo;
	}


	@Override
	public String toString() {
		return "MyEmployee [empId=" + empId + ", empName=" + empName + ", sal="
				+ sal + ", deptNo=" + deptNo + "]";
	}
	
}