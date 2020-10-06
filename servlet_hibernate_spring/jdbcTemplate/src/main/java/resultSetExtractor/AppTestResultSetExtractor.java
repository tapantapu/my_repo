package resultSetExtractor;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTestResultSetExtractor {

	public static void main(String[] args) {

		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContextResultSetExtractor.xml");
		EmployeeDao eDao = (EmployeeDao)applicationContext.getBean("edao");
		
		List<Employee> eList=eDao.getAllEmployee();
		
		for(Employee e: eList) {
			System.out.println(e);
		}
		
	}

}
