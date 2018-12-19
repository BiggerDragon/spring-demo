package com.dragon.demo.test.appcontext;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dragon.demo.service.ActivityQueryService;
import com.dragon.demo.service.impl.ActivityQueryServiceImpl;

public class TestFileSystemXmlApplicationContext {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		FileSystemXmlApplicationContext fileSystemXmlApplicationContext = 
				new FileSystemXmlApplicationContext("C:\\Users\\Administrator\\eclipse-workspace\\spring-demo\\src\\main\\resources\\applicationContext.xml");
		
		fileSystemXmlApplicationContext.start();
		ActivityQueryService activityQueryService = 
				fileSystemXmlApplicationContext.getBean(ActivityQueryService.class);
		System.out.println("appName=" 
				+ ((ActivityQueryServiceImpl)activityQueryService).getAppName());
		System.out.println("FileSystemXmlAppContextStarter started!");
	}
}
