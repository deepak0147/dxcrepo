package com.dxc.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class AspectHelper {

		@Before("execution(public void openAccount())")
		
		public void logging() {
			
			System.out.println("Account open process");
		}
	
		@After("execution(public void openAccount())")
		public void logging1() {
			
			System.out.println("Account is opened");
		}
	
		
		@AfterReturning("execution(public void deposit())")
		public void transaction() {
			
			System.out.println("Money is deposited");
			
		}
		
		
		@Around("execution(public void withdraw())")
		public void transaction1() {
			
			System.out.println("1000 is withdrawn from account");
			
		}
		
	    @AfterThrowing("execution(public void minBalance())")
		public void transcation2() {
			
			System.out.println("amount is less than minimum amount");
			
		}
	
	
}
