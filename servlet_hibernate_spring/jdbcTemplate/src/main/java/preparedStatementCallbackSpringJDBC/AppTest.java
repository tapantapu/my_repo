package preparedStatementCallbackSpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextPSC.xml");

		EmployeeDao edao = (EmployeeDao) applicationContext.getBean("edao");
		Boolean saveStatus = edao.saveEmployedDataPS(new Employee(10, "ABCDEF", 200000));
		System.out.println("saveStatus--->" + saveStatus);
	}
}
