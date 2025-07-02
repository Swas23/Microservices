package com.cts.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspects {
	
	@Before("execution(public void addCustomer())")
	public void beforeAspect() {
		System.out.println("Before execution of the addCustomer method");
	}
	
	@After("execution(public void updateCustomer())")
	public void afterReturningAspect() {
		System.out.println("After respect executed after successful update operation ");
	}
	
	@Pointcut("within(com.cts.model.CustomerService)")
	public void advice() {
	}
	
	@AfterThrowing("execution(public void updateCustomer())")
	public void afterThrowingAdvice() {
		System.out.println("After Throwing advice executed");
	}
	
	@AfterReturning("execution(public void deleteCustomer())")
	public void afterReturningAdvice() {
		System.out.println("After Returning Advice executed after deleteCustomer method");
	}
	
	
	@Around("execution(public void purchase())")
	public Object aroundAdvice(ProceedingJoinPoint pj) {
		System.out.println("Before execution");
		Object obj = null;
//		try {
//			obj=pj.proceed();
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("After execution");
		return obj;
	}
	
}
