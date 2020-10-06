package setter.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

	@Bean
	public SetterHelloWorld getObject() {
		return new SetterHelloWorld();
	}
	
	/*The above code will be equivalent to the following XML configuration
	 * <beans>
	   <bean id = "helloWorld" class = "com.tutorialspoint.SetterHelloWorld" />
	</beans>*/
}
