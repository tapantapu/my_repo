package JdbcTemplate.jdbcTemplate;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;
	
public void setjdbcTemplate(JdbcTemplate jdbcTemplate)	{
	this.jdbcTemplate=jdbcTemplate;
}

public int saveEmployee(Employee e) {
	String query="insert into Employee values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
	return jdbcTemplate.update(query);
	
}


public int updateEmployee(Employee e) {
	String query="update Employee set name = '"+e.getName()+"' where id = '"+e.getId()+"'";
	return jdbcTemplate.update(query);	
	
}

public  int deleteEmployee(Employee e) {
	String query="delete from Employee where id = '"+e.getId()+"'";
	return jdbcTemplate.update(query);	
}
}