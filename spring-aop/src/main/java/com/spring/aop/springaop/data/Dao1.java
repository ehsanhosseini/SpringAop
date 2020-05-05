package com.spring.aop.springaop.data;

import org.springframework.stereotype.Repository;

import com.spring.aop.springaop.aspect.TrackTime;

@Repository
public class Dao1 {
	
	@TrackTime
	public String retriveData() {
		return "DAO1";
	}

}
