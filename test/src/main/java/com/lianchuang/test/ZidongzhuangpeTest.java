package com.lianchuang.test;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.lianchuang.dao.AutoWareDaoImpl;
import com.lianchuang.service.AutoWareServiceImpl;

@RunWith(BlockJUnit4ClassRunner.class)
public class ZidongzhuangpeTest extends UnitTestBase {

	public ZidongzhuangpeTest() {
		super("classpath*:spring-auto.xml");

	}

	@Test
	public void Test1() {
		AutoWareServiceImpl as = super.getBean("autoWareService");
		as.say(as.getAutoWareDao().say("传入的数据"));

	}
}
