package com.learn.annote.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learn.annote.model.AnnoteMessage;

@Configuration
public class AnnotateConfig {

	@Bean
	public AnnoteMessage getMessage(){
		return new AnnoteMessage();
	}
}
