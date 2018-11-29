package com.learn.model;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartHandler implements ApplicationListener<ContextStartedEvent>{

	@Override
	public void onApplicationEvent(ContextStartedEvent strEvent) {
		// TODO Auto-generated method stub
		System.out.println("ContextStartedEvent Received");
	}

}
