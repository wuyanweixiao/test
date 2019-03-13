/**
* @Title: 测算字母.java 
* @Package com.lianchuang.jiugongge 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年10月9日 下午6:30:11 
* @version V1.0   
 */
package com.lianchuang.jiugongge;

/**
* @ClassName: 测算字母 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年10月9日 下午6:30:11 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
  英文绕口令
peter piper picked a peck of pickled peppers
统计这段绕口令有多少个以p开头的单词
 */
public class 测算字母 {
/*public static void main(String[] args) {
	String s ="peter piper picked a peck of pickled peppers";
	String ss[] = s.split(" ");
	int num = 0;
	for (int i = 0; i < ss.length; i++) {
		if (ss[i].charAt(0)=='p') {
			num++;
		}
	}
	System.out.println("这段绕口令有多少个以p开头的单词有 "+num+" 个!" );
}*/
/*public static void main(String[] args) {
	//把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy
	String s = "lengendary";
	char[] c = s.toCharArray();
	for (int i = 0; i < c.length; i++) {
		if (i%2==0) {
			c[i] = (char) (c[i]-32);
		}
	}
	s = new String(c);
	System.out.println(s);
}*/
	public static void main(String[] args) {
		//创建一个长度是100的字符串数组
		//使用长度是2的随机字符填充该字符串数组
		//统计这个字符串数组里重复的字符串有多少种
		String [] ss =new String[100];
		for (int i = 0; i < ss.length; i++) {
			ss[i] = getRandomChar();
		}
		for (int i = 1; i <= ss.length; i++) {
			if (i%10==0) {
				System.out.print(ss[i-1]+"\n");
			}else{
			System.out.print(ss[i-1]+" ");
			}
		}
	}
	public static String getRandomChar(){
		char c[] = new char[52];
		int index = 65;
		for (int i = 0; i < c.length; i++) {
			c[i] = (char)index;
			index++;
			if (index==91) {
				index= 97;
			}
		}
		char[]cc =  new char[2];
		for (int i = 0; i < cc.length; i++) {
		cc[i]=c[(int)(Math.random()*52)];
		}
		String s = new String(cc);
		return s;
	}
	public static String[] getRepeat(String [] strings){
		String[] ss = new String[100]; 
		int num =0;
		for (int i = 0; i < strings.length; i++) {
			for (int j = i+1; j < strings.length; j++) {
				if (strings[i].equals(strings[j])) {
					ss[num] = strings[i];
					num++;
					break;
				}
			}
		}
		return ss;
	}
}
