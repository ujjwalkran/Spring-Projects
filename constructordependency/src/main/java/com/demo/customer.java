package com.demo;

import lombok.Data;

@Data
public class customer {
	private int customerid;
	private String customername;
	private String customeremail;
	
	customer(){
		
	}
	public customer(int customerid, String customername, String customeremail) {
		
		this.customerid = customerid;
		this.customername = customername;
		this.customeremail = customeremail;
	}
	
	
	

}
