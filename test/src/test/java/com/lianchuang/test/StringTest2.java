/**
* @Title: StringTest.java 
* @Package com.lianchuang.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年11月6日 下午7:39:48 
* @version V1.0   
 */
package com.lianchuang.test;

import org.junit.Test;

/**
* @ClassName: StringTest 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年11月6日 下午7:39:48 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */

public class StringTest2 {
/*	@Test
	public void stringTest(){
		String s = "abc";
		String s1 ="abfasd";
		System.out.println(s.compareTo(s1));
		char c [] =  {'a','b','c'};
		String s2 = String.copyValueOf(c);
		System.out.println(s2);
	}*/
	@Test
	public void stringBufferTest(){
		StringBuffer sb = new StringBuffer();
		sb.append("12gbqwjkdakdhksdaskjdhakhsdgwhhasdijhnasdjhwiashdw我他妈射爆");
		System.out.println(sb==null);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}
