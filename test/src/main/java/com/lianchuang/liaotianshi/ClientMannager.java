/**
* @Title: ClientMannager.java 
* @Package com.lianchuang.liaotianshi 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2019年2月24日 下午6:32:15 
* @version V1.0   
 */
package com.lianchuang.liaotianshi;

import java.util.Vector;

/**
* @ClassName: ClientMannager 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2019年2月24日 下午6:32:15 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class ClientMannager {

    private ClientMannager() {
    }

    public static Vector<ChatSocket> sockets = new Vector<ChatSocket>();

    //向其他客户端发送数据
    public static void sendAll(ChatSocket chatSocket, String send) {
        for (ChatSocket socket : sockets) {
            if (!chatSocket.equals(socket)) {
                socket.send(send);
            }
        }
    }
}
