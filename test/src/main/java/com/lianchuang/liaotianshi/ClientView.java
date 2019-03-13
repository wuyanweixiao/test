/**
* @Title: ClientView.java 
* @Package com.lianchuang.liaotianshi 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2019年2月24日 下午6:23:08 
* @version V1.0   
 */
package com.lianchuang.liaotianshi;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
* @ClassName: ClientView 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2019年2月24日 下午6:23:08 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class ClientView extends JFrame implements ActionListener, KeyListener, Runnable {
	//博德之门好难啊
    private JTextArea textArea;
    private JTextField textField, tfName;
    private JButton btnSend, btnId;
    private JLabel label;
    private JPanel jp1, jp2;
    public boolean isConnect = false;
    private Socket socket =null ;
    private DataInputStream inputStream =null ;
    private DataOutputStream outputStream = null;
    private JScrollPane scrollPane;
    private static ClientView view;

    public JTextArea getTextArea() {
        return textArea;
    }

    public DataInputStream getInputStream() {
        return inputStream;
    }
    public DataOutputStream getOutputStream() {
        return outputStream;
    }

    public static void main(String[] args) {
        view = new ClientView();
        ServiceView.clientViews.add(view);
        Thread thread = new Thread(view);
        thread.start();
    }

    public ClientView() {
        initView();
        try {
            socket = new Socket("localhost", 9090);//连接本地服务器

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initView() {
        textArea = new JTextArea(20, 20);
        textArea.setEditable(false);
        scrollPane = new JScrollPane(textArea);
        textField = new JTextField(15);
        textField.addKeyListener(this);
        //添加发送按钮
        btnSend = new JButton("发送");
        btnSend.addActionListener(this);
        label = new JLabel("昵称：");
        tfName = new JTextField(8);
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp1.add(label);
        jp1.add(tfName);
        tfName.setText("用户0");
        jp1.setLayout(new FlowLayout(FlowLayout.CENTER));
        jp2.add(textField);
        jp2.add(btnSend);
        jp2.setLayout(new FlowLayout(FlowLayout.CENTER));

        add(jp1, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(jp2, BorderLayout.SOUTH);
        setTitle("聊天室");
        setSize(500, 500);
        setLocation(450, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() { //窗口关闭后断开连接
            public void windowClosing(WindowEvent e) {
                try {
                    if (socket != null)
                        socket.close();
                    if (inputStream!= null)
                        inputStream.close();
                    if (outputStream != null)
                        outputStream.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSend) {
            sendMsg();
        }
    }

    private void sendMsg() {
        try {
            String s = textField.getText();
            if (!s.equals("")) { //发送数据
                textField.setText("");
                textArea.append("我(" + tfName.getText() +  "):\r\n" + s + "\r\n");
                outputStream = new DataOutputStream(socket.getOutputStream());
                outputStream.writeUTF(tfName.getText() + "#" + s); 
                outputStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    public void keyPressed(KeyEvent arg0) {
        if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
            sendMsg();
        }
    }

    public void keyReleased(KeyEvent arg0) {

    }

    public void keyTyped(KeyEvent arg0) {

    }

    public void run() {
        try {
        	//通过socket来获取输出流
            inputStream = new DataInputStream(socket.getInputStream());
            //通过“#”来分割所获取的文字
            while (true) {
                String[] s = inputStream.readUTF().split("#");
                textArea.append(s[0] + ":\r\n" + s[1] + "\r\n");
            }
        } catch (IOException e) {
        }

    }
}