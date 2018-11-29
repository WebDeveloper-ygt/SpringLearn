package com.learn.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.annote.model.Profile;
import com.learn.annote.model.Student;
import com.learn.model.ContextMessanger;
import com.learn.model.Message;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
	      Message message = (Message) context.getBean("Message");
	      
	      System.out.println(message.getMessage());
	      
	      Student stud =(Student) context.getBean("student");
	      System.out.println(stud.getName());
	      System.out.println(stud.getAge());
	      System.out.println("==============================");
	      
	      Profile prof =(Profile) context.getBean("profile");
	      prof.getStudent().ToString();
	      
	      System.out.println("==============================");
	      
	      ConfigurableApplicationContext appContext = new ClassPathXmlApplicationContext("spring-bean.xml");
	      appContext.start();
	      
	      ContextMessanger ctxMess = (ContextMessanger) appContext.getBean("contextMessanger");
	      System.out.println(ctxMess.getInvitation());
	      
	      appContext.stop();

	}

}
