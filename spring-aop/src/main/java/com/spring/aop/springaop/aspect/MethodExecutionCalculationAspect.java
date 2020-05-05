package com.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//Weaver is the framework that implements AOP — AspectJ or Spring AOP.


@Aspect   //  indicates that this is an Aspect // Combination of pointcut and advice called it Aspect 
@Configuration // indicates that this file contains a Spring Bean Configuration for an Aspect.
public class MethodExecutionCalculationAspect {

	
	
private Logger loger = LoggerFactory.getLogger(this.getClass()); 

	
	
	@Around("com.spring.aop.springaop.aspect.CommanJoinPointConfig.trackTimeAnotation())")  
	public void afterReturn(ProceedingJoinPoint joinpoint) throws Throwable { 
		
		//strat time x
		//allow execution of method 
		//end time y
		
		long startTime = System.currentTimeMillis();
		joinpoint.proceed();
		long timeTaken = System.currentTimeMillis() - startTime;
		
		loger.info("Time taken by -->{} is {}", joinpoint, timeTaken); 
	}
	
	
} 	
