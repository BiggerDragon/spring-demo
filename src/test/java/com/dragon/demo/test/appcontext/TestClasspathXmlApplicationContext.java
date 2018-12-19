package com.dragon.demo.test.appcontext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dragon.demo.service.ActivityQueryService;
import com.dragon.demo.service.impl.ActivityQueryServiceImpl;

public class TestClasspathXmlApplicationContext {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext classPathXmlApplicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		classPathXmlApplicationContext.start();
		ActivityQueryService activityQueryService = 
				classPathXmlApplicationContext.getBean(ActivityQueryService.class);
		System.out.println("appName=" 
				+ ((ActivityQueryServiceImpl)activityQueryService).getAppName());
		System.out.println("FileSystemXmlAppContextStarter started!");
	}

}
