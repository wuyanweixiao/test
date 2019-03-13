/**
* @Title: Test2.java 
* @Package com.lianchuang.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年12月4日 下午8:16:28 
* @version V1.0   
 */
package com.lianchuang.test;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

/**
* @ClassName: Test2 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年12月4日 下午8:16:28 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class Test2 {
	@Test
	public void test1(){
		//编写程序实现对给定的 4 个整数从大到小的顺序排列。
		int a = 1024;
		int b = 10242;
		int c = 10243;
		int d = 1021;
		int [] array ={a,b,c,d};
		this.get1(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	//运用Array.sort(array);方法排序
	public int[] get(int[] array){
		Arrays.sort(array);
		return array;
	}
	//自己写的冒泡排序
	public int[] get1(int[] array){
		if (array!=null) {
			//int min = array[0];
			//int max = array[0];
			int temp = 0;
			for (int i1 = 0; i1 < array.length; i1++) {
				for (int i = 0,j = i+1; i < array.length-1&&j<array.length; i++,j++) {
					if (array[i]<array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			}
		
		}
		return array;
	}
}
