package com.ep.listener;

import org.springframework.context.ApplicationListener;

import com.ep.event.CancleOrderEvent;

public class ManageEventListener implements ApplicationListener<CancleOrderEvent> {

	public void onApplicationEvent(CancleOrderEvent event) {
		System.out.println("returning the fund for order"+event.getOrderNo()+"for amout"+event.getAmount());
	}

}
