package com.lianchuang.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import com.lianchuang.service.InjectionService;
import com.lianchuang.service.InjectionServiceImpl;
/**
* @ClassName: InjectionTest
* @Description: 继承UnitTestBase 这个类，实现了读取指定格式的spring.xml文件 (这里用一句话描述这个类的作用) 
* @author 杨忠兵
* @date 2017年11月23日 下午5:50:38 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class InjectionTest extends UnitTestBase {

	public InjectionTest() {
		super("classpath*:spring-injection.xml");	
	}
	@Test
	 public void test1(){
		 InjectionService service = UnitTestBase.getBean("injectionService");
		 service.save("完成一小段任务，需要继续坚持！");
	 }
}
