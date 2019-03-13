/**
* @Title: 一元二次方程.java 
* @Package jiefangcheng 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2019年1月4日 下午7:41:41 
* @version V1.0   
 */
package jiefangcheng;

import java.util.Scanner;

import org.junit.Test;

/**
* @ClassName: 一元二次方程 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2019年1月4日 下午7:41:41 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
  //△=b^2-4ac的值,若△小于0,一元二次方程无根.若△等于0,一元二次方程有两个相等的根.
  * 若△大于0,一元二次方程有两个不相等的实数根
 */
public class 一元二次方程 {
	@Test
	public void test(){
		Scanner sc = new  Scanner(System.in);
		System.out.println("请输入二次项系数:");
		int a = sc.nextInt();
		System.out.println("请输入一次项系数:");
		int b = sc.nextInt();
		System.out.println("请输入常数项系数:");
		int c = sc.nextInt();
		double d = b*b-(4*a*c);
		if (d<0) {
			System.out.println("此方程无解!");
		}else {
			System.out.println("此方程有两个解:");
			//-b加减根号下b平方减4ac；
			double x1 = (-b+Math.sqrt(d))/(2*a);
			double x2 = (-b-Math.sqrt(d))/(2*a);
			System.out.println("这两个解是:x1="+x1+"\t"+"x2="+x2);
		}
	}
}
