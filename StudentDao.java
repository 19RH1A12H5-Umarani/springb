package springb;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
public class StudentDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int insertStudent(Student student) {
		String query="insert into student(id,name,gender,marks,email,branch) values(?,?,?,?,?,?)";
		int r=jdbcTemplate.update(query,student.getId(),student.getName(),student.getGender(),student.getMarks(),student.getEmail(),student.getBranch());
		return r;
	}
	public int deleteStudent(Student student) {
		String query1="delete from student where id=?";
		int r=jdbcTemplate.update(query1,student.getId());
		return r;
	}
	public int updateNameStudent(Student student) {
		String query2="update student set name=? where id=?";
		int r=jdbcTemplate.update(query2,student.getName(),student.getId());
		return r;
	}
	public int updateMarksStudent(Student student) {
		String query2="update student set marks=? where id=?";
		int r=jdbcTemplate.update(query2,student.getMarks(),student.getId());
		return r;
	}
	public int updateEmailStudent(Student student) {
		String query2="update student set email=? where id=?";
		int r=jdbcTemplate.update(query2,student.getEmail(),student.getId());
		return r;
	}
	public int updateBranchStudent(Student student) {
		String query2="update student set branch=? where id=?";
		int r=jdbcTemplate.update(query2,student.getBranch(),student.getId());
		return r;
	}
	public List<Student> selectStudent(Student student) {
	      String query3 = "select * from student";
	      List<Student> students = jdbcTemplate.query(query3, new BeanPropertyRowMapper<Student>(Student.class));
	      return students;
	   }

}
