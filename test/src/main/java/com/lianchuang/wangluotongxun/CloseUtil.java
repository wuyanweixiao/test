/**
* @Title: CloseUtile.java 
* @Package com.lianchuang.wangluotongxun 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2019年2月24日 下午4:54:11 
* @version V1.0   
 */
package com.lianchuang.wangluotongxun;

import java.io.Closeable;
import java.io.IOException;

/**
* @ClassName: CloseUtile 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2019年2月24日 下午4:54:11 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class CloseUtil {
	public static void closeAll(Closeable...io){
		for (Closeable temp : io) {
			if (temp!=null) {
				try {
					temp.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
