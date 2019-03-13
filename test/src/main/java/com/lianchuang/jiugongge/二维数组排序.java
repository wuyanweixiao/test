/**
* @Title: 二维数组排序.java 
* @Package com.lianchuang.jiugongge 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年10月15日 下午8:42:17 
* @version V1.0   
 */
package com.lianchuang.jiugongge;

/**
 * @ClassName: 二维数组排序
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2018年10月15日 下午8:42:17 <a href-"http://www.baidu.com">百度一下</a> <a
 *       href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a>
 */
public class 二维数组排序 {

	/**
	 * 二位数组排序 将一个二维数组中填充一定范围的随机数，然后通过一定的方法排序
	 */
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = getRandomNumber();
			}
		}
		// 排序前：
		System.out.println("排序前：");
		for (int[] is : arr) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		// 开始排序，用比较笨的方法，取出第一个数，依次和后面的数比较，找出最小的然后和第一个数对换。
		// 专门写个方法吧！
		int[][] arr1 = new int[5][5];
		arr1 = getSortArray(arr);
		System.out.println("排序后：");
		for (int[] is : arr1) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static int getRandomNumber() {
		return (int) (Math.random() * 999);
	}
	public static int[][] getSortArray(int[][] arr) {
		int min;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				min = arr[i][j];
				for (int j2 = 0; j2 < arr.length; j2++) {					
					for (int k = 0; k < arr[j2].length; k++) {
						if (min > arr[j2][k]) {
							temp = min;
							min = arr[j2][k];
							arr[j2][k] = temp;
							arr[i][j] = min;
						}
					}
				}
				System.out.println("min :" +min);
			}
		}
		return arr;
	}
}
