package core;

public class PersonSalary extends PersonBase {

	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PersonSalary [salary=" + salary + ", getFname()=" + getFname()
				+ ", getLname()=" + getLname() + "]";
	}
	
	
}
