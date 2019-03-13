/**
* @Title: WenJianDuQu.java 
* @Package com.lianchuang.wenjian 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2019年2月26日 下午9:05:02 
* @version V1.0   
 */
package com.lianchuang.wenjian;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import org.junit.Test;

/**
* @ClassName: WenJianDuQu 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2019年2月26日 下午9:05:02 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class WenJianDuQu {
	private File file = null;//目标文件
	private BufferedReader br = null;//文件读取
	private String fileName ="";//文件名
	private String s = null;//目标字符
	private Scanner sc = new Scanner(System.in);
	@Test
	public void test(){
		//计数：
		int num = 0;
		//1:读取文件地址
		System.out.println("请输入文件名：");
		fileName = sc.nextLine();
		if (fileName!=null) {
			file = new File(fileName);
		}
		System.out.println("请输入要查询的字符串:");
		//请输入要查询的字符串
		s = sc.nextLine();
		//2:创建文件读取流
		try {
			br = new BufferedReader(new FileReader(file));
			String ss = null;
			//读取文件的一行，如果不为空就说明文件没有读完，就继续循环
			while ((ss = br.readLine())!=null) {
				//String的indexOf方法就是返回值为-1就表示没有这个字符串
				int index =-1;
				//System.out.println(ss.length());
				//如果该行的长度大于等于目标字符串长度并且存在于该行中
				while (ss.length()>=s.length() && (index = ss.indexOf(s))>=0) {
					//该行字符串重新赋值为截取原来这行的目标字符串后面的字符串
					ss= ss.substring(index+s.length());
					//字符计数
					num++;
				}
			}
			System.out.println("该字符串在文件中出现了"+num+"次！");
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
