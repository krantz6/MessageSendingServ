package com.message.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.message.service.impl.messageSendingServiceImpl;

public class applicationContextBeans {

	
	@SuppressWarnings("resource")
	public static messageSendingServiceImpl getInstance()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		messageSendingServiceImpl messageSendingServiceImplObject = (messageSendingServiceImpl) context.getBean("messageSendingServiceImpl");
		return messageSendingServiceImplObject;
	}
}
