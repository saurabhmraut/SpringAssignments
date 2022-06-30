package demo;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

//@Configuration
//@PropertySource("classpath:config.properties") 

public class TestMain {


	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(demo.dbConfig.class);
				
		BasicDataSource service=  (BasicDataSource) applicationContext.getBean("dataSource");
		
		System.out.println(service);
		System.out.println(service.getUrl());
		System.out.println(service.getUsername());
		System.out.println(service.getPassword());
		
	}
}
