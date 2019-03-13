/**
* @Title: ThreadTest.java 
* @Package com.lianchuang.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年11月11日 下午8:06:37 
* @version V1.0   
 */
package com.lianchuang.test;

import org.junit.Test;

/**
* @ClassName: ThreadTest 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年11月11日 下午8:06:37 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class ThreadTest {
	@Test
	public void test(){
		Thread t1 = new Thread1();
		Thread t2 = new Thread1();
		Thread t3 = new Thread1();
		Thread t4 = new Thread1();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		t4.setName("Thread4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	public static void main(String[] args) {
		Thread t1 = new Thread1();
		Thread t2 = new Thread1();
		Thread t3 = new Thread1();
		Thread t4 = new Thread1();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		t4.setName("Thread4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
