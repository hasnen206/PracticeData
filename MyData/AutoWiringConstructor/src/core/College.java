package core;

public class College {

	Student stu;
	private String year;
	
	public College(Student stu,String year){
		this.stu=stu;
		this.year=year;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "College [stu=" + stu + ", year=" + year + "]";
	}
	
	
	
}
