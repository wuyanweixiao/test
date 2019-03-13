/**
* @Title: KeBianCanShu.java 
* @Package com.lianchuang.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年11月5日 下午11:26:55 
* @version V1.0   
 */
package com.lianchuang.test;

/**
* @ClassName: KeBianCanShu 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年11月5日 下午11:26:55 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class KeBianCanShu {
	public int addAll(int...a){
		int sum =0;
		for (int i = 0; i < a.length; i++) {
			sum = sum+a[i];
		}
		return sum;
	}
}
