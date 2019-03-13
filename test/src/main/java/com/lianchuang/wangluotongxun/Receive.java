/**
* @Title: Receive.java 
* @Package com.lianchuang.wangluotongxun 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2019年2月24日 下午4:43:14 
* @version V1.0   
 */
package com.lianchuang.wangluotongxun;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;


/**
* @ClassName: Receive (接收)
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2019年2月24日 下午4:43:14 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class Receive  implements Runnable{
	private DataInputStream  dis;
	private boolean isRunning = true;
	public Receive(){
		
	}
	public Receive(Socket client){
			try {
				dis = new DataInputStream(client.getInputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				isRunning = false;
				CloseUtil.closeAll(dis);
			}
	}
	public String receive(){
		String msg ="";
		try {
			msg = dis.readUTF();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			isRunning = false;
			CloseUtil.closeAll(dis);
		}
		return msg;
	}
	public void run() {
		// TODO Auto-generated method stub
		while (isRunning) {
			System.out.println(receive());
		}
	}

}
