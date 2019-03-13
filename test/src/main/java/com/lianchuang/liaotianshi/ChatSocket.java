/**
* @Title: ChatSocket.java 
* @Package com.lianchuang.liaotianshi 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2019年2月24日 下午6:30:24 
* @version V1.0   
 */
package com.lianchuang.liaotianshi;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
* @ClassName: ChatSocket 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2019年2月24日 下午6:30:24 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class ChatSocket implements Runnable{
    private Socket socket =null ;
    private DataInputStream inputStream =null ;
    private DataOutputStream outputStream = null;

    public DataInputStream getInputStream() {
        return inputStream;
    }

    public DataOutputStream getOutputStream() {
        return outputStream;
    }

    public ChatSocket(Socket socket) {
        this.socket = socket;
        try {
            inputStream = new DataInputStream(socket.getInputStream());
            outputStream = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void send(String send) { //向客户端发送数据
        try {
            outputStream.writeUTF(send);
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() { //循环读取客户端发来的数据
        String accept = null;

        while (true) {
            try {
                accept = inputStream.readUTF();

                ClientMannager.sendAll(this, accept);
            } catch (IOException e) {
                ClientMannager.sockets.remove(this);
            }
        }
    }
}
