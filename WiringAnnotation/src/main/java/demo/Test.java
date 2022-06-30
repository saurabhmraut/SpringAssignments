package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) { 

		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationConfig.xml");
		Customer customer=(Customer) context.getBean("customer");
		//customer.toString();
		System.out.println("Customer Deatils:");
		System.out.println(customer);
	}

}
