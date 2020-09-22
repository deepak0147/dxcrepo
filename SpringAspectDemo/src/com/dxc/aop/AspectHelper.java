package com.dxc.aop;

import org.aspectj.lang.annotation.After;
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

		@After("execution(public void showBalance())")
		public void logging() {
			
			System.out.println("logging info for showBal() on show call...");
		}
	
		//@Pointcut("execution(public void withdraw())")
		//@Around("withdraw()")
		@Before("execution(public void withdraw())")
		@After("execution(public void withdraw())")
		public void transaction() {
			
			System.out.println("transaction()");
			
		}
	
		public void security() {
			
			System.out.println("security()");
			
		}
	
	
}
