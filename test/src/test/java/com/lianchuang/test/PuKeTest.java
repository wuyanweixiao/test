/**
* @Title: PuKeTest.java 
* @Package com.lianchuang.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年11月5日 下午9:54:32 
* @version V1.0   
 */
package com.lianchuang.test;

import org.junit.Test;

/**
 * @ClassName: PuKeTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2018年11月5日 下午9:54:32 <a href-"http://www.baidu.com">百度一下</a> <a
 *       href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a>
 */
public class PuKeTest { 
/*	@Test
	public static void test() {
		Puke p1[] = Pukes.getPuke();
		for (int i = 0; i < p1.length; i++) {
			if (i == 0) {
				System.out.print("[" + p1[i].getHuase() + p1[i].getZifu() + ",");
			} else if (i == p1.length - 1) {
				System.out.print(p1[i].getHuase() + p1[i].getZifu() + "]");
			} else {
				System.out.print(p1[i].getHuase() + p1[i].getZifu() + ",");
			}
		}
	}*/
	@Test
	public void test1(){
		KeBianCanShu ks = new KeBianCanShu();
		System.out.println(ks.addAll(1,-2,10));
	}
}
