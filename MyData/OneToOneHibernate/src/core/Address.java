package core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS_TABLE")
public class Address {

	private Integer aId;
	private String city;
	private String state;
	
	@Id
	@Column(name="ADDRES_ID")
	public Integer getaId() {
		return aId;
	}
	public void setaId(Integer aId) {
		this.aId = aId;
	}
	
	@Column(name="ADDRES_CITY")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Column(name="ADDRES_STATE")
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
