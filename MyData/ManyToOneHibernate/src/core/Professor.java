package core;

import oracle.net.jdbc.TNSAddress.Address;

public class Professor {

	private Integer profid;
	private String profName;
	private PAddress pAddress;
	
	
	
	
	public PAddress getpAddress() {
		return pAddress;
	}
	public void setpAddress(PAddress pAddress) {
		this.pAddress = pAddress;
	}
	public Integer getProfid() {
		return profid;
	}
	public void setProfid(Integer profid) {
		this.profid = profid;
	}
	public String getProfName() {
		return profName;
	}
	public void setProfName(String profName) {
		this.profName = profName;
	}
	
	
	
}
