package com.ep.event;

import org.springframework.context.ApplicationEvent;

public class CancleOrderEvent extends ApplicationEvent {

	private String orderNo;
	private String reason;
	private String time;
	private String amount;
	
	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public CancleOrderEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "CancleOrderEvent [orderNo=" + orderNo + ", reason=" + reason + ", time=" + time + ", amount=" + amount
				+ "]";
	}

}
