package rowMapper;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRowMapper {

	public static void main(String[] args) {

		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContextRowMapper.xml");
		
		EmployeeDao edao=(EmployeeDao)applicationContext.getBean("edao");
		
		List<Employee> list=edao.getAllEmployeeRowMapper();
		 for(Employee e: list) {
			 System.out.println(e);
		 }
		
	}

}
