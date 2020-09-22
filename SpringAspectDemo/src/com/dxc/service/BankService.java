package com.dxc.service;

import org.springframework.stereotype.Component;

@Component
public class BankService {
	
	
	
	public void showBalance() {
		
		System.out.println("Your Balance is 7000");
		
	}
	
	
	public void withdraw() {
		
		System.out.println("withdraw() called...");
		
	}
	

}
