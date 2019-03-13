package com.lianchuang.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLiveTest1 implements InitializingBean,DisposableBean {
	public void start(){
		System.out.println("Bean Start.");
	}
	public void stop(){
		System.out.println("Bean Stop.");
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
	System.out.println("Bean destroy.");
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean afterPropertiesSet.");
	}
}
