package com.lianchuang.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AwareTest implements ApplicationContextAware{

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("AwareTest 实现了ApplicationContextAware 方法后的哈希值："+ applicationContext.getBean("awareTest").hashCode());
		
	}

}
