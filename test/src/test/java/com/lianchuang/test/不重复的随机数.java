/**
* @Title: 不重复的随机数.java 
* @Package com.lianchuang.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年11月6日 上午12:05:11 
* @version V1.0   
 */
package com.lianchuang.test;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

/**
* @ClassName: 不重复的随机数 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年11月6日 上午12:05:11 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class 不重复的随机数 {
	@Test
	public void test1(){
		int[] s = new int[100];
	a:	for (int i = 0; i < s.length; i++) {
			int temp =(int)(Math.random()*1000);
			for (int j = 0; j < s.length; j++) {
				if (temp==s[j]) {
					i--;
					continue a;
				}
			}
			s[i] = temp;
		}
		Arrays.sort(s);
		for (int i = 0; i < s.length; i++) {
			System.out.println(i+" "+s[i]);
		}
	}
}
