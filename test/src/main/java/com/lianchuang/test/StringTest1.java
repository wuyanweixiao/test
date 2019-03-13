/**
* @Title: StringTest1.java 
* @Package com.lianchuang.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2019年3月12日 下午10:47:35 
* @version V1.0   
 */
package com.lianchuang.test;

/**
* @ClassName: StringTest1 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2019年3月12日 下午10:47:35 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class StringTest1 {
	public  boolean getName(String name){
		return name.toLowerCase()==("xiaodao");
	}
	public static void main(String[] args) {
	/*	StringTest1 st1 = new StringTest1();
		System.out.println(st1.getName("XIAODAO"));*/
		String a ="abcd";//在常量池中找，没有就创建这个常量
		String b = new String("abcd");//需要开辟一块新的内存
		System.out.println(a==(b));
	}
}
