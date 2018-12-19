package com.dragon.demo.config;

import java.io.IOException;
import java.util.HashSet;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan(basePackages="com.dragon.demo.*", 
excludeFilters=@ComponentScan.Filter(ComponentScan.class))
public class AppConfig {
	
	@Value("${spring.appname}")
	private String appname;
	
	@Bean
	public PropertyPlaceholderConfigurer getPropertyPlaceholderConfigurer() throws IOException {
		
		PropertyPlaceholderConfigurer placeholderConfigurer = new PropertyPlaceholderConfigurer();
		System.out.println(getProperties());
		placeholderConfigurer.setProperties(getProperties());
		
		return placeholderConfigurer;
		
	}
	
	@Bean
	public Properties getProperties() throws IOException {
		PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
		Resource [] locations = new ClassPathResource[] {
				new ClassPathResource("application.properties")
		};
		propertiesFactoryBean.setLocations(locations);
		propertiesFactoryBean.afterPropertiesSet();
		return propertiesFactoryBean.getObject();
	}
	
	@Bean(name="messageSource")
	public MessageSource getMessageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasenames("msg");
		return messageSource;
	}
	
	

	public String getAppname() {
		return appname;
	}

	public void setAppname(String appname) {
		this.appname = appname;
	}
	
	
	


}
