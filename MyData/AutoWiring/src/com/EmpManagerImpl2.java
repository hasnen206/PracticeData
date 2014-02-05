package com;

public class EmpManagerImpl2 implements EmpManager {

	EmpDAO emp;
	EmpDAO anandl;

	public EmpDAO getAnandl() {
		return anandl;
	}

	public void setAnandl(EmpDAO anandl) {
		this.anandl = anandl;
	}

	public EmpDAO getEmp() {
		return emp;
	}

	public void setEmp(EmpDAO emp) {
		this.emp = emp;
	}

	@Override
	public void met2() {
		emp.met1();
		anandl.met1();
		
	}
	
	
	
}
