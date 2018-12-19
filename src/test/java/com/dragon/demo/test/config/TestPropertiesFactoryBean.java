package com.dragon.demo.test.config;

import java.io.IOException;

import org.junit.Test;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestPropertiesFactoryBean {

	@Test
	public void test01() throws IOException {
		PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
		Resource [] locations = new ClassPathResource[] {
				new ClassPathResource("application.properties")
		};
		System.out.println(locations[0].exists());
		System.out.println(locations[0].getFilename());
		System.out.println(locations[0].getURI());
		propertiesFactoryBean.setLocations(locations);
		propertiesFactoryBean.afterPropertiesSet();
		System.out.println(propertiesFactoryBean.getObject());
		System.out.println(propertiesFactoryBean.getObjectType());
		
	}
	
}
