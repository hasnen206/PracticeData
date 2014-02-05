package core;

public class PersonAddress extends PersonBase {

	private int zipcode;

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "PersonAddress [zipcode=" + zipcode + ", getFname()="
				+ getFname() + ", getLname()=" + getLname() + "]";
	}
	
	
}
