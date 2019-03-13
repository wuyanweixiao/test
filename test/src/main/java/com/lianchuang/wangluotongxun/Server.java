/**
* @Title: Server.java 
* @Package com.lianchuang.wangluotongxun 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2019年2月23日 下午6:23:48 
* @version V1.0   
 */
package com.lianchuang.wangluotongxun;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
* @ClassName: Server 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2019年2月23日 下午6:23:48 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class Server {
	private List<MyChannel> all = new ArrayList<MyChannel>();
	public static void main(String[] args) throws IOException {
		 new Server().start();
	}
	public void start() throws IOException{
		//这里是建立一个新的服务器
		ServerSocket server = new ServerSocket(9999);
		 while(true){
	            Socket client = server.accept();
	            MyChannel channel = new MyChannel(client);
	            all.add(channel);//统一管理
	            new Thread(channel).start();//一条道路
	        }
	}
}

