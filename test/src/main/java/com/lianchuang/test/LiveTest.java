package com.lianchuang.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class LiveTest extends UnitTestBase{

	public LiveTest() {
		super("classpath*:spring-beanlive.xml");
		
	}
	@Test
	public void test1(){
		BeanLiveTest1 b1 = super.getBean("beanlivetest");
		System.out.println("b1 : "+ b1.hashCode());
		BeanLiveTest1 b2 = super.getBean("beanlivetest");
		System.out.println("b2 : "+ b2.hashCode());
 	}
}
