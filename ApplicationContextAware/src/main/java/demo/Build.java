package demo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public class Build {

	private ApplicationContext context;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}

	public void Slow() {
		System.out.println("In Slow method");

		ApplicationContextTest applicationContextTest = (ApplicationContextTest) context.getBean("appContext");

		applicationContextTest.go();

	}
}
