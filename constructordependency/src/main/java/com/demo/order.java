package com.demo;

public class order {
	private int orderid;
	private String orderdetail;
	
	
	public order(int orderid, String orderdetail) {
		super();
		this.orderid = orderid;
		this.orderdetail = orderdetail;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getOrderdetail() {
		return orderdetail;
	}
	public void setOrderdetail(String orderdetail) {
		this.orderdetail = orderdetail;
	}
	@Override
	public String toString() {
		return "order [orderid=" + orderid + ", orderdetail=" + orderdetail + "]";
	}
	
	

}
