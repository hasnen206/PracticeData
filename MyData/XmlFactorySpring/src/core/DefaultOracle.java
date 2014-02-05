package core;

public class DefaultOracle implements Oracle {

	Encyclo enc;
	public void setEnc(Encyclo enc){
		this.enc=enc;
	}
	@Override
	public String define() {
		long a=enc.findLong("A");
		long b=enc.findLong("B");
		return String.valueOf(a/b);
	}

}
