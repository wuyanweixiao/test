/**
* @Title: Service.java 
* @Package com.lianchuang.liaotianshi 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2019年2月24日 下午6:33:22 
* @version V1.0   
 */
package com.lianchuang.liaotianshi;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

/**
* @ClassName: Service 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2019年2月24日 下午6:33:22 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class Service implements Runnable{

    private ServerSocket serverSocket =null ;

    public ServerSocket getServerSocket() {
        return serverSocket;
    }

    public void run() {
        try {
            serverSocket = new ServerSocket(9090); //创建端口
            while (true) { //循地接收客户端的连接
                Socket socket = serverSocket.accept();
                JOptionPane.showMessageDialog(ServiceView.getView(), "客户端连接端口", "TIP", JOptionPane.INFORMATION_MESSAGE);
                ChatSocket chatSocket = new ChatSocket(socket); //新客户端连接
                ClientMannager.sockets.add(chatSocket); //往客户端管理器里添加客户
                Thread thread = new Thread(chatSocket); //启用线程使服务器开始不断接收客户端信息
                thread.start();

            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("服务器关闭");
        }
    }

}
