package constructor.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

	@Bean()
	public ConstructorHelloWorld getObj() {
		return new ConstructorHelloWorld("Tapan");
	}
	
}
