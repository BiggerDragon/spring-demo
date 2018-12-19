package com.dragon.demo.test.appcontext;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class TestAnnotationConfigWebApplicationContext {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext = 
				new AnnotationConfigWebApplicationContext();
		
		annotationConfigWebApplicationContext.start();
	}

}
