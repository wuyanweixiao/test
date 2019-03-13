/**
* @Title: 拆分文件.java 
* @Package com.lianchuang.jiugongge 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年10月16日 下午6:32:46 
* @version V1.0   
 */
package com.lianchuang.jiugongge;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName: 拆分文件
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2018年10月16日 下午6:32:46 <a href-"http://www.baidu.com">百度一下</a> <a
 *       href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a>
 */
public class 拆分文件 {

	/**
	 * 将文件 java计算器.jar 拆分成 java计算器.jar-0, java计算器.jar-1, java计算器.jar-2......
	 * java计算器.jar-3四份 并且合成后能够正常执行！
	 */
	public static void main(String[] args) {
		// file: 目标文件
		/*
		 * File file = new File("D:/java计算器.jar"); try { File[] files =
		 * getFiles(file); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
		//合成文件
		File[] files = new File[4];
		for (int i = 0; i < files.length; i++) {
			files[i] = new File("d:/java计算器.jar-" + i);
		}
		File file =  CompositeFile(files, "d:/java计算器1.jar");
	}

	// 拆分文件的方法
	/*
	 * 
	 * */
	public static File[] getFiles(File file) throws IOException {
		File files[] = new File[4];
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos;
		byte[] b = new byte[(int) file.length() / 4];
		fis.read(b);
		for (int i = 0; i < files.length; i++) {
			files[i] = new File("d:/java计算器.jar-" + i);
			fos = new FileOutputStream(files[i]);
			fos.write(b);
			fos.flush();
			fos.close();
		}
		fis.close();
		return files;
	}

	// 合成文件的方法
	public static File CompositeFile(File[] files, String path) {
		File file = new File(path);
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			int index = 0;
			int size = 0;
			for (int i = 0; i < files.length; i++) {
				size = (int)files[i].length()+size;
			}
			byte[] b = new byte[size];
			System.out.println(files.length);
			fos = new FileOutputStream(file);
			for (int i = 0; i < files.length; i++) {
				fis = new FileInputStream(files[i]);
				fis.read(b,index,(int)files[i].length());
				index = (int)(index + files[i].length());
			}
			System.out.println(b.length);
			fos.write(b);
			fos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return file;

	}
}
