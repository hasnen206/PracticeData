package core;

public class OperationMultiply implements Operation {

	@Override
	public long operate(long a, long b) {
		
		return a*b;
	}

	@Override
	public String getOperationName() {
		
		return "Multiply";
	}

}
