package assignment8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext   context = new ClassPathXmlApplicationContext("AppConfig.xml");
		 
        Person person = context.getBean("person", Person.class);
 
        System.out.println("Name= " + person.getName());
  	
		context.close();
        
        
    }
}
