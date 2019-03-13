/**
* @Title: testBni.java 
* @Package com.lianchuang.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2019年2月21日 下午7:19:19 
* @version V1.0   
 */
package com.lianchuang.test;

import java.util.Scanner;

import org.junit.Test;

/**
 * @ClassName: testBni
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2019年2月21日 下午7:19:19 <a href-"http://www.baidu.com">百度一下</a> <a
 *       href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a>
 */
public class testBMI {
	/*
	 * 使用Scanner收集你的身高体重，并计算出你的BMI值是多少
	 * 
	 * BMI的计算公式是 体重(kg) / (身高*身高)
	 * 
	 * 比如邱阳波的体重是72kg, 身高是1.69，那么这位同学的BMI就是 72 / (1.69*1.69) = ? 过轻：低于18.5
	 * 正常：18.5-23.9 过重：24-27 肥胖：28-32 非常肥胖, 高于32
	 */
	@Test
	public void test1() {
		System.out.println("请输入你的身高(单位m):");
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		System.out.println("请输入你的体重(单位kg):");
		double bodyWeight = sc.nextDouble();
		double bmi = bodyWeight / (height * height);
		String a = "属于体重偏轻,请注意身体健康!";
		String b = "属于体重正常,请保持身体健康!";
		String c = "属于体重偏重,请多运动合理饮食,减轻身体负担!";
		String d = "属于体重肥胖,肥胖对身体健康有碍,请及时减轻体重!";
		String e = "属于体重非常肥胖,非常肥胖对身体健康非常有碍,请及时减轻体重!";
		String f = "您的BMI的指数为:" + bmi;
		if (bmi < 18.5) {
			System.out.println(f + a);
		} else if (bmi >= 18.5 && bmi <= 24) {
			System.out.println(f + b);
		} else if (bmi > 24 && bmi < 28) {
			System.out.println(f + c);
		} else if (bmi >= 28 && bmi <= 32) {
			System.out.println(f + d);
		} else if (bmi > 32) {
			System.out.println(f + e);
		}
	}
}
