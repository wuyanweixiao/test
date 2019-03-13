/**
* @Title: jiugongge.java 
* @Package com.lianchuang.jiugongge 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年10月8日 上午9:56:30 
* @version V1.0   
 */
package com.lianchuang.jiugongge;

/**
* @ClassName: jiugongge 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年10月8日 上午9:56:30 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class jiugongge {
	/*
	 * 什么是九宫格？
	 * 简单来说，就是一个3*3的正方形格子里按照一定规律填写1-9这几个数字，
	 * 使其横竖斜相加起来都等于15
	 * 其中有种算法是这样的: 1在上头正中间,然后斜上依次排,右边超出左头写,上边超出下头写,有数占位向下移.
	 * */
	private int[][] jgg ;
	private int[] num ={1,2,3,4,5,6,7,8,9};
	public jiugongge() {
		super();
		this.jgg = new int[3][3];
	}

	public int[][] getJgg() {
		return jgg;
	}

	public void setJgg(int[][] jgg) {
		this.jgg = jgg;
	}
	public void printlnJgg(){
		int j = 0;
		int k = 1;
		for (int i = 1; i <= num.length; i++) {
			if (i==1) {
				jgg[j][k]=i;
			}else {
				int j2 = j;
				int k2 = k;
					j=getFanWei2(j,jgg[1].length);
					k=getFanWei1(k,jgg[1].length);
					if (jgg[j][k]==0) {
						jgg[j][k] = i;
					}else {	
					jgg[j2+1][k2] = i;
					j= j2+1;
					k= k2;
					}			
			}
			
		}
		for (int i = 0; i < jgg.length; i++) {
			for (int l = 0; l < jgg.length; l++) {
				if (l==2) {
					System.out.print(jgg[i][l]+"\n");
				}else {
					System.out.print(jgg[i][l]+" ");
				}
			}
		}
	}
	public int getFanWei1(int j,int k){
		if (j+1>=k) {
			j=0;
		}else {
			j=j+1;
		}
		return j;
	}
	public int getFanWei2(int j,int k){
		if (j-1<0) {
			j=k-1;
		}else {
			j=j-1;
		}
		return j;
	}
	public int getFanWei3(int j,int k,int i){
		if (i+1>=k) {
		}
		if (j+1>=k) {
			j=0;
		}else {
			j=j+1;
		}
		return j; 
	}
}
