package com.lianchuang.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class AwareTest1 extends UnitTestBase {

	public AwareTest1() {
		super("classpath*:spring-aware.xml");
	}
	@Test
	public void test1(){
		AwareTest awareTest = super.getBean("awareTest");
		System.out.println("AwareTest 在Test方法中的哈希值 ："+ awareTest.hashCode());
	}
}
