package department;

public class MyDept {
private int deptNo;
private String deptName;

public MyDept(){
	
}

public MyDept(int deptNo, String deptName) {
	super();
	this.deptNo = deptNo;
	this.deptName = deptName;
}

public int getDeptNo() {
	return deptNo;
}

public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}

public String getDeptName() {
	return deptName;
}

public void setDeptName(String deptName) {
	this.deptName = deptName;
}

@Override
public String toString() {
	return "MyDept [deptNo=" + deptNo + ", deptName=" + deptName + "]";
}


}
