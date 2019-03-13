package com.lianchuang.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
@RunWith(BlockJUnit4ClassRunner.class)
public class test1 {
	@Test
	public void test(){
		Integer a =100,b=100;
		System.out.println(a==b);
		Integer c=150,d=150;
		System.out.println(c==d);
	}
}
