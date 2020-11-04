package com.ep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ep.source.OrderManagementService;

public class MainApp {


	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/ep/comman/application-context.xml");
	 OrderManagementService managementService = applicationContext.getBean("orderManagementService",OrderManagementService.class);
		managementService.updateOrderDetail("10101","cancle");

	}

}
