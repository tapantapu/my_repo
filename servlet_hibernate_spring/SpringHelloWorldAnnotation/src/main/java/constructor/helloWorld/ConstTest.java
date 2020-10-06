package constructor.helloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		ConstructorHelloWorld ch = context.getBean(ConstructorHelloWorld.class);
		ch.getName();

	}

}
