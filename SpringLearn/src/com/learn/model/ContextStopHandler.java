package com.learn.model;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
//@Spring

public class ContextStopHandler implements ApplicationListener<ContextStoppedEvent>{

	@Override
	public void onApplicationEvent(ContextStoppedEvent arg0) {
		// TODO Auto-generated method stub
	      System.out.println("ContextStoppedEvent Received");
	}

}
