package com.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommanJoinPointConfig {
	
	@Pointcut("execution(* com.spring.aop.springaop.data.*.*(..))")
	public void dataLayerExecution() {}
	
	
	@Pointcut("execution(* com.spring.aop.springaop.business.*.*(..))")
	public void businessLayerExecution() {}
	
	
	// this is for tracktime annotation for dao1
	@Pointcut("@annotation(com.spring.aop.springaop.aspect.TrackTime)")
	public void trackTimeAnotation() {}

}
