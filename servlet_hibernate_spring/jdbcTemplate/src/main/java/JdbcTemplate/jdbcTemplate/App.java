package JdbcTemplate.jdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("edao");

		Employee e1 = new Employee();
		e1.setId(10);
		e1.setName("Tapan");
		e1.setSalary(10000);
		int saveStatus = dao.saveEmployee(e1);
		Employee e2 = new Employee();
		e2.setId(11);
		e2.setName("Raju");
		e2.setSalary(20000);
		int saveStatus1 = dao.saveEmployee(e2);
		System.out.println(" saveStatus ----> " + saveStatus1);
		/* int saveStatus = dao.saveEmployee(new Employee(10, "Tapan", 2000)); */

		/* System.out.println("saveStatus -----> " + saveStatus); */

		/*
		 * int updateStatus=dao.updateEmployee(new Employee(10,"Jitu Bhai"));
		 * System.out.println("UpdateStatus -----> " + updateStatus);
		 */

		/*
		 * int deletStatus=dao.deleteEmployee(new Employee(10));
		 * System.out.println("deletStatus -----> " + deletStatus);
		 */
	}
}
