package com.learn.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learn.annote.config.AnnotateConfig;
import com.learn.annote.model.AnnoteMessage;


public class AnnotatedApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotateConfig.class);
		AnnoteMessage message =(AnnoteMessage) context.getBean("getMessage", AnnoteMessage.class);
		message.setMessage("hello world");
		System.out.println(message.getMessage());
		
	}

}
