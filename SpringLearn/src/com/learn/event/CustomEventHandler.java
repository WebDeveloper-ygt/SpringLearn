package com.learn.event;

import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomEvent>{

	@Override
	public void onApplicationEvent(CustomEvent custEve) {
		// TODO Auto-generated method stub
		System.out.println(custEve.toString());
	}
	
	String query = "CREATE TABLE Student(ID   INT NOT NULL AUTO_INCREMENT,NAME VARCHAR(20) NOT NULL,AGE  INT NOT NULL,PRIMARY KEY (ID))";

}
