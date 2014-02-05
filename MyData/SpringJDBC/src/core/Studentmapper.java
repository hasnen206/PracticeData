package core;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class Studentmapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int row) throws SQLException {
		Student s1=new Student();
		s1.setId(rs.getInt("ID"));
		s1.setName(rs.getString("NAME"));
		s1.setAge(rs.getInt("AGE"));
		return s1;
	}

}
