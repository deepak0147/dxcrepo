package com.dxc.service;

import org.springframework.stereotype.Component;

@Component
public class Bank{
	
	
	public void openAccount() {
		
		String name="Anilkumar";
		String email="anil@gmail.com";
		long phone=822079654;
		int age=22;
		
		System.out.println(name   +  email  +   phone  +  age);
	}
	
	
	public void deposit() {
		
		int addedAmount=2000;
		
		System.out.println("Money deposited:"+addedAmount);
		
		}
	
	
	
	       public void Balance() {
		
		System.out.println("Your balance is:"+10000 );
		
	}
	
	
	public void withdraw() {
		
		
		
	}
	
	public void minBalance() {
		
		int balance=400;
		
		if(balance<500) {
			
			System.out.println("Minimum balance not maintaing");
			
		}
	}
	

}
