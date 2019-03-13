/**
* @Title: 九九乘法表.java 
* @Package com.lianchuang.jiugongge 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年10月9日 下午5:26:28 
* @version V1.0   
 */
package com.lianchuang.jiugongge;

/**
* @ClassName: 九九乘法表 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年10月9日 下午5:26:28 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class 九九乘法表 {
//随便写个九九乘法表
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+"*"+i +"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}
