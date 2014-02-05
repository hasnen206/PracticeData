package com;

public class EmpManagerImpl implements EmpManager {

	EmpDAO empdao;
	
	public EmpDAO getEmpdao() {
		return empdao;
	}

	public void setEmpdao(EmpDAO empdao) {
		this.empdao = empdao;
	}

	public void met2() {
		empdao.met1();

	}

}
