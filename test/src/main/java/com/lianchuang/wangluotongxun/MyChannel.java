/**
* @Title: MyChannel.java 
* @Package com.lianchuang.wangluotongxun 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2019年2月24日 下午5:13:16 
* @version V1.0   
 */
package com.lianchuang.wangluotongxun;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
* @ClassName: MyChannel 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2019年2月24日 下午5:13:16 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
class MyChannel implements Runnable {
		private DataInputStream dis;
		private DataOutputStream dos;
		private boolean isRunning = true;
		private String name;
		private List<MyChannel> all = new ArrayList<MyChannel>();
	    public MyChannel(Socket client) {
	        try {
	            dis = new DataInputStream(client.getInputStream());
	            dos = new DataOutputStream(client.getOutputStream());

	            this.name = dis.readUTF();
	            //System.out.println(this.name);
	            this.send("欢迎进入聊天室");//发给自己
	            sendOthers(this.name + "进入了聊天室",true);
	        } catch (IOException e) {
	            //e.printStackTrace();
	            CloseUtil.closeAll(dis,dos);
	            isRunning = false;
	        }
	    }
	    private String receive(){ //接收的方法！
	    	String msg = "";
	    	try {
				msg = dis.readUTF();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				CloseUtil.closeAll(dis);
	            isRunning = false;
	            all.remove(this);//移除自身
			}
	    	return msg;
	    }
	    private void send(String msg){
	        if(msg==null || msg.equals("")){
	            return;
	        }
	        try {
	            dos.writeUTF(msg);
	            dos.flush();
	        } catch (IOException e) {
	            //e.printStackTrace();
	            CloseUtil.closeAll(dos);
	            isRunning = false;
	            all.remove(this);//移除自身
	        }
	    }
	    /**
	     * 发送给其它客户端
	     */
	    private void sendOthers(String msg,boolean sys){
	        //是否为私聊，约定规则
	        if(msg.startsWith("@") && msg.indexOf(":")>-1){//私聊
	            //获取name
	            String name = msg.substring(1, msg.indexOf(":"));
	            String content = msg.substring(msg.indexOf(":") + 1);
	            for (MyChannel other : all) {
	                if(other.name.equals(name)){
	                    other.send(this.name + "对你悄悄地说：" + content);
	                }
	            }
	        }else{
	            //String msg = this.receive();
	            //遍历容器
	            for (MyChannel other : all) {
	                if(other==this){
	                    continue;
	                }
	                if(sys){//系统信息
	                    other.send("系统信息：" + msg);
	                }else{
	                    //发送给其它客户端
	                    other.send(this.name + "对所有人说：" + msg);
	                }
	            }
	        }
	    }

	    public void run() {
		while(isRunning){
			 sendOthers(receive(),false);
		}
			
		}

}
