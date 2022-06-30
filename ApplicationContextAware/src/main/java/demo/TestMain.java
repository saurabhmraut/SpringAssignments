package demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("AppConfig.xml");

		ApplicationContextTest2 test2 = (ApplicationContextTest2) context.getBean("appContext2");

		test2.walk();

		Build build = (Build) context.getBean("build");
		build.Slow();

	}
}
