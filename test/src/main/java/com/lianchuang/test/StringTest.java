/**
* @Title: StringTest.java 
* @Package com.lianchuang.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年11月18日 上午11:19:42 
* @version V1.0   
 */
package com.lianchuang.test;

import org.junit.Test;

/**
* @ClassName: StringTest 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年11月18日 上午11:19:42 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class StringTest {
	@Test
	public void test1(){
		String str = new String ("ab"+"cd");
		System.out.println(str);
	}
}
