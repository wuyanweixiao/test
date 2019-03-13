/**
* @Title: Send.java 
* @Package com.lianchuang.wangluotongxun 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2019年2月24日 下午4:16:53 
* @version V1.0   
 */
package com.lianchuang.wangluotongxun;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
* @ClassName: Send 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2019年2月24日 下午4:16:53 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class Send implements Runnable{

	private BufferedReader console;//控制台输出流
	private DataOutputStream dos;//管道输出流
	private boolean isRunning = true;//控制线程
	private String name;//名称
	public Send(){
		console = new BufferedReader(new InputStreamReader(System.in));
	};
	public Send(Socket client,String name){
		this();
		try {
			dos = new DataOutputStream(client.getOutputStream());
			this.name = name;
			//send(this.name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			isRunning = false;	
			CloseUtil.closeAll(dos,console);
		}

	}
	private String getMsgFromConsole(){
		try {
			return console.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	public void send(String msg){
		//String msg = new getMsgFromConsole();
		 if(msg!=null &&!msg.equals("")){
	            try {
	                dos.writeUTF(msg);
	                dos.flush();//强制刷新
	            } catch (IOException e) {
	                //e.printStackTrace();
	                isRunning = false;
	                CloseUtil.closeAll(dos,console);
	            }
	        }
	}
	public void run() {
		// TODO Auto-generated method stub
		while (isRunning) {
			send(getMsgFromConsole());
		}
	}

}
