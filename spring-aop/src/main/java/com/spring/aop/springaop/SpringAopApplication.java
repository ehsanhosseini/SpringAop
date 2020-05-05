package com.spring.aop.springaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.aop.springaop.business.BusinessImp1;
import com.spring.aop.springaop.business.BusinessImp2;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

	private Logger loger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private BusinessImp1 business1;
	
	@Autowired
	private BusinessImp2 business2;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		loger.info(business1.calculateSomething());
		loger.info(business2.calculateSomething());
		
	}

}
