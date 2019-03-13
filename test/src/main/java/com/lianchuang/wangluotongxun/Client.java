/**
* @Title: Client.java 
* @Package com.lianchuang.wangluotongxun 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2019年2月23日 下午5:53:12 
* @version V1.0   
 */
package com.lianchuang.wangluotongxun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
* @ClassName: Client (客户端)
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2019年2月23日 下午5:53:12 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class Client {
	public static void main(String[] args) throws IOException {
		System.out.println("请输入名称：");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		if (name.equals("")) {
			return;
		}
		Socket client  = new Socket("HELLOWORLD", 9999);
		//控制台输出
		new Thread (new Send(client,name)).start();//一条路径
		new Thread (new Receive(client)).start();//另一条路径
	}
}
