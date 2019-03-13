/**
* @Title: 数组反转.java 
* @Package com.lianchuang.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2019年3月2日 上午10:13:38 
* @version V1.0   
 */
package com.lianchuang.test;

import org.junit.Test;

/**
* @ClassName: 数组反转 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2019年3月2日 上午10:13:38 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class 数组反转 {
	@Test
	public void test1(){
		//先将一个空数组充填5个随机数
		int[] a = new int[6];
		System.out.println("原数组:");
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)((Math.random()*100)+1);
			if (i!=a.length-1) {
				System.out.print(a[i]+",");
			}else {
				System.out.println(a[i]);
			}
			
		}
	//开始反转数组，思路：看数组是奇数还是偶数，如果是奇数，循环(int) Math.floor((a.length/2))次，偶数循环n/2次
		int num = 0;
		if ((a.length%2)!=0) {
			num = (int) Math.floor((a.length/2));
		}else if ((a.length%2)==0) {
			num = a.length/2;
		}
		for (int i = 0; i < num; i++) {
			int tamp = a[a.length-i-1];
			a[a.length-i-1] = a[i];
			a[i] = tamp;
		}
		System.out.println("反转后:");
		for (int i = 0; i < a.length; i++) {
			if (i!=a.length-1) {
				System.out.print(a[i]+",");
			}else {
				System.out.println(a[i]);
			}
		}
	}	
}
