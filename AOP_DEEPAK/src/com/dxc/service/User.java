package com.dxc.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		 Bank service =		context.getBean(Bank.class);
		 
		       service.openAccount();
		       
		       service.deposit();
		 
				 	service.Balance();
		 
		
				 		service.withdraw();
				 		
				 		service.minBalance();
		
		
		

	}

}
