package SEPL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.xml");
		Expressions d1 = context.getBean("expressions",Expressions.class);
		
		System.out.println(d1);

	}
}
