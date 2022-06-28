package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 

public class Test {

	public Test() { 
	}

	public static void main(String[] args) { 
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicatonConfig.xml");
		Questions question= applicationContext.getBean("question",Questions.class);
		question.DisplayAnswerInList();
		
		Questions question1= applicationContext.getBean("question1",Questions.class);
		question1.DisplayAnswerInSet();
		
		Questions question2= applicationContext.getBean("question2",Questions.class);
		question2.DisplayAnswerInMap();

	}

}
