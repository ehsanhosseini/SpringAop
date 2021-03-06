package com.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//Weaver is the framework that implements AOP — AspectJ or Spring AOP.


@Aspect   //  indicates that this is an Aspect // Combination of pointcut and advice called it Aspect 
@Configuration // indicates that this file contains a Spring Bean Configuration for an Aspect.
public class AfterAopAspect {

	
	
private Logger loger = LoggerFactory.getLogger(this.getClass()); 

	
	// what kind of call I would intercept
	//execution(* PACKAGE.*.*(..)) //This defines the pointcut. We would want to intercept all method calls made to any methods in package
	
	// execution(* com.spring.aop.springaop.business.*.*(..)) --> this expretion called poitcut. what kind of method I want to intercept 
	//Only intercept business
	//Passing one more parameter
	@AfterReturning(value="com.spring.aop.springaop.aspect.CommanJoinPointConfig.businessLayerExecution()", returning = "result")  // executed only when a method executes successfully.
	public void afterReturn(JoinPoint joinpoint, Object result) { // JoinPoint, we can get details. it is specific interception of a method call
		loger.info("{} --> Return with value -->{}", joinpoint, result); // Advice
	}
	
	// used for both scenarios, throwing exception(@AfterThrowing)/returning value
	@After(value="com.spring.aop.springaop.aspect.CommanJoinPointConfig.businessLayerExecution()")  
	public void after(JoinPoint joinpoint) { 
		loger.info("After execution joinpoint -->{}", joinpoint); 
	}
	
} 	
