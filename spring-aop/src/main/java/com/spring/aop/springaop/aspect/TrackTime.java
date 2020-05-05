package com.spring.aop.springaop.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



@Target(ElementType.METHOD)  // target is just for method 
@Retention(RetentionPolicy.RUNTIME) // we want these information at runtime 

public @interface TrackTime {

	

}
