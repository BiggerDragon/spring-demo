package com.dragon.demo;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

import com.dragon.demo.config.AppConfig;
import com.dragon.demo.service.ActivityQueryService;
import com.dragon.demo.service.impl.ActivityQueryServiceImpl;

public class SpringDemoStarter {

	public static void main(String[] args) {
		
		//==================AppConfig
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		annotationConfigApplicationContext.start();
		
		PropertyPlaceholderConfigurer placeholderConfigurer = 
				annotationConfigApplicationContext.getBean(PropertyPlaceholderConfigurer.class);
		System.out.println(placeholderConfigurer);
		
		
		//================placeholderConfigurer
		AppConfig appConfig = annotationConfigApplicationContext.getBean(AppConfig.class);
		System.out.println("appname is :" + appConfig.getAppname());
		
		ActivityQueryService activityQueryService = 
				annotationConfigApplicationContext.getBean(ActivityQueryService.class);
		System.out.println("appName=" 
				+ ((ActivityQueryServiceImpl)activityQueryService).getAppName());
		
		//===================messageSource
		MessageSource messageSource = 
				annotationConfigApplicationContext.getBean(ResourceBundleMessageSource.class);
		System.out.println("messageSource is annotationConfigApplicationContext="+
				(messageSource==annotationConfigApplicationContext));
		System.out.println(messageSource.getMessage("AC1001", null,null));
		System.out.println(annotationConfigApplicationContext.getMessage("AC1003", null, null));
		
		System.out.println("spring demo start!");

	}

}
