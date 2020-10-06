package setter.helloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class SetterTest 
{
    public static void main( String[] args )
    {
       ApplicationContext applicationContext=new AnnotationConfigApplicationContext(HelloWorldConfig.class);
       SetterHelloWorld setterHelloWorld=applicationContext.getBean(SetterHelloWorld.class);
       setterHelloWorld.setName("Tapan");
       setterHelloWorld.printName();
    	
    }
}
