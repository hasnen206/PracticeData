package core;

public class Calculate {

	Operation op;

	public void setOp(Operation op) {
		this.op = op;
	}
	
	public void execute(int a,int b){
		System.out.println(op.operate(a, b));
		System.out.println(op.getOperationName());
	}
	
}
