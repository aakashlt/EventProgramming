package com.ep.source;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.ep.event.CancleOrderEvent;

public class OrderManagementService implements ApplicationEventPublisherAware {
	
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void updateOrderDetail(String orderId,String status) {
		
		CancleOrderEvent cancleOrderEvent =null;
		if(status.equals("cancle")) {
			cancleOrderEvent = new CancleOrderEvent(this);
			cancleOrderEvent.setOrderNo(orderId);
			cancleOrderEvent.setAmount("12");
			cancleOrderEvent.setReason("high Price");
		applicationEventPublisher.publishEvent(cancleOrderEvent);
		}
		
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;		
	}

}
