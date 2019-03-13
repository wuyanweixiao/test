/**
* @Title: Thread1.java 
* @Package com.lianchuang.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年11月11日 下午7:58:46 
* @version V1.0   
 */
package com.lianchuang.test;

/**
* @ClassName: Thread1 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author A18ccms a18ccms_gmail_com 
* @date 2018年11月11日 下午7:58:46 
* <a href-"http://www.baidu.com">百度一下</a> 
  <a href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a> 
 */
public class Thread1 extends Thread {
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	private static int num=200;
	private ChePiao cp = new ChePiao();
	private static String str ="111";
	/**
	 * @param string
	 */
	public Thread1() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public  void run() {
		while(num>=1){
			synchronized (str) {
				
				if (num>=1) {
					cp.setId(num--);
					cp.setName("重庆");
					getCgePiao();	
				}
			}	
		}
		
	}
	public  void getCgePiao(){	
				System.out.println(Thread.currentThread().getName()+" :"+cp.toString());
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	public  ChePiao setChePiao(){
		cp.setId(num--);
		cp.setName("重庆");
		return cp;
	}
}
