package core;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {

	void setDataSource(DataSource ds);
	void create(String name,Integer age);
	List<Student>ListStudent();
	Student getStudent(Integer id);
	void updateAge(Integer id,Integer age);
	void delete(Integer id);
}
