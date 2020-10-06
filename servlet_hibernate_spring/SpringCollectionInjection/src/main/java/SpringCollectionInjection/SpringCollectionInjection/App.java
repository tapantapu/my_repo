package SpringCollectionInjection.SpringCollectionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext =new ClassPathXmlApplicationContext("SpringBean.xml");
    	JavaCollection jc=(JavaCollection)applicationContext.getBean("collectionBean");
    	jc.getAddressList();
    	jc.getAddressSet();
    	jc.getAddressMap();
    	jc.getAddressProp();
    	
    }
}
