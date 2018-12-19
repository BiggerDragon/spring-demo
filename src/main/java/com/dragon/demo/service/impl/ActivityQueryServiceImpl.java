package com.dragon.demo.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.dragon.demo.datamodel.RequestContext;
import com.dragon.demo.service.ActivityQueryService;

@Service
public class ActivityQueryServiceImpl implements ActivityQueryService {
	
	@Value("${spring.appname}")
	private String appName;

	public RequestContext queryActivity(RequestContext requestContext) {
		
		return null;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
	
	

}
