package Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	  public static void main(String args[])
	  { 
		  
//		  ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		  
		  // using setter Injection 
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Display.xml");
		  
			 Address address= applicationContext.getBean("address",Address.class);
//			Address address1 = (Address) applicationContext.getBean("address");
			 
			 Customer customer=applicationContext.getBean("customer", Customer.class);
//			 System.out.println(address);
			 System.out.println(customer);
			 
//			 Address address1= applicationContext.getBean("address1",Address.class);
			 Customer customer1=applicationContext.getBean("customer1", Customer.class);
//			 System.out.println(address1);
			 System.out.println(customer1);
		  
		  
	  }
	  
	}
