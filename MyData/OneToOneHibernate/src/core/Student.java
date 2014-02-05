package core;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_TABLE")
public class Student {

	private Integer sId;
	private String sName;
	private Address sAddress;
	
	@Id
	@Column(name="STUDENT_ID")
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	@Column(name="STUDENT_NAME")
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	@OneToOne(cascade=CascadeType.ALL)
	public Address getsAddress() {
		return sAddress;
	}
	public void setsAddress(Address sAddress) {
		this.sAddress = sAddress;
	}
	
	
}
