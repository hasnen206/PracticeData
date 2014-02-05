package core;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJdbcTemplate implements StudentDAO {

	private DataSource ds;
	private JdbcTemplate jt;
	
	

	@Override
	public void setDataSource(DataSource ds) {
		this.ds=ds;
		jt=new JdbcTemplate(ds);
		
	}

	@Override
	public void create(String name, Integer age) {
		String sql="INSERT INTO STUDENT VALUES(ID.NEXTVAL,?,?)";
		System.out.println("Data Added");
		jt.update(sql, name,age);
		
	}

	@Override
	public List<Student> ListStudent() {
		String sql="SELECT * FROM STUDENT";
		List<Student> students=jt.query(sql, new Studentmapper());
		return students;
	}

	@Override
	public Student getStudent(Integer id) {
		String sql="SELECT * FROM STUDENT WHERE ID=?";
		
		Student s1=jt.queryForObject(sql, new Object[]{id},new Studentmapper());
		return s1;
	}

	@Override
	public void updateAge(Integer id, Integer age) {
		String sql="UPDATE STUDENT SET AGE=? WHERE ID=?";
		jt.update(sql, age,id);
		
	}

	@Override
	public void delete(Integer id) {
		String sql="DELETE FROM STUDENT WHERE ID=?";
		jt.update(sql, id);
	}

}
