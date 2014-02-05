package core;

import java.util.HashSet;
import java.util.Set;

public class Participant {

	private Integer pid;
	private String pname;
	private Set<Course> courses=new HashSet<>();
	public Participant(String pname, Set<Course> courses) {
		
		this.pname = pname;
		this.courses = courses;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	
	
}
