package com.learn.event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyeventApplication {
	public static void main(String[] args) {
	      ConfigurableApplicationContext context = 
	         new ClassPathXmlApplicationContext("spring-bean.xml");
		  
	      CustomEventPublisher cvp = 
	         (CustomEventPublisher) context.getBean("customEventPublisher");
	      
	      cvp.publish();  
	      cvp.publish();
	   }
}
