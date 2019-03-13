/**
* @Title: ServiceView.java 
* @Package com.lianchuang.liaotianshi 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2019年2月24日 下午6:27:43 
* @version V1.0   
 */
package com.lianchuang.liaotianshi;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
* @ClassName: ServiceView 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2019年2月24日 下午6:27:43 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class ServiceView extends JFrame implements ActionListener{
    private JButton btnOpen, btnStop;
    private JLabel label;
    private Service service = null;
    public static ArrayList<ClientView> clientViews = new ArrayList<ClientView>();
    private static ServiceView view;

    public static ServiceView getView() {
        return view;
    }
    public static void main(String[] args) {
        view = new ServiceView();
    }

    public ServiceView() {
        initView();
    }

    private void initView() {
        btnOpen = new JButton("打开服务器");
        btnStop = new JButton("关闭服务器");
        btnStop.setEnabled(false);
        btnOpen.addActionListener(this);
        btnStop.addActionListener(this);
        label = new JLabel("服务器停止工作");
        add(label);
        add(btnOpen);
        add(btnStop);
        setTitle("服务器");
        setLayout(new GridLayout(3, 1, 0, 10));
        setSize(300, 300);
        setLocation(450, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOpen) {
            open();
        } else {
            stop();
        }
    }

    public void open() { //开启服务器
        service = new Service();
        Thread thread = new Thread(service);
        thread.start();
        label.setText("服务器正在运行");
        btnOpen.setEnabled(false);
        btnStop.setEnabled(true);
    }

    public void stop() { //关闭服务器
        label.setText("服务器已关闭");
        btnOpen.setEnabled(true);
        btnStop.setEnabled(false);
        try {
            synchronized (ClientMannager.sockets) { //关闭各个连接
                for (ChatSocket socket : ClientMannager.sockets) {
                    socket.getInputStream().close();
                    socket.getOutputStream().close();
                }
                ClientMannager.sockets.removeAllElements();
            }


            for (ClientView view : clientViews) {
                view.getInputStream().close();
                view.getOutputStream().close();
            }

            service.getServerSocket().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

