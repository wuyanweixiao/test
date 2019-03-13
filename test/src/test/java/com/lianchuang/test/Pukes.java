/**
* @Title: pukes.java 
* @Package com.lianchuang.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author A18ccms A18ccms_gmail_com   
* @date 2018年11月5日 下午8:55:08 
* @version V1.0   
 */
package com.lianchuang.test;

/**
 * @ClassName: pukes
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author A18ccms a18ccms_gmail_com
 * @date 2018年11月5日 下午8:55:08 <a href-"http://www.baidu.com">百度一下</a> <a
 *       href-"https://translate.google.cn/#en/zh-CN/Preference">谷歌翻译</a>
 */
// 把这个写成单例模式;
public class Pukes {
	private static Puke pukes[] = new Puke[54];
	private static Pukes pukes1 =null;

	private Pukes() {
	}

	private static void setPukes() {
		String zufus[] = getZiFu();
		String huases[] = getHuaSe();
		//System.out.println(huases[0]);
		for (int i = 0; i < pukes.length; i++) {
			pukes[i] = new Puke();
			if (i >= 0 && i <= 12) {
				String h = huases[0];
				pukes[i].setHuase(h);
				pukes[i].setZifu(zufus[i]);
			}
			if (i >= 13 && i <= 25) {
				pukes[i].setHuase(huases[1]);
				pukes[i].setZifu(zufus[i - zufus.length]);
			}
			if (i >= 26 && i <= 38) {
				pukes[i].setHuase(huases[2]);
				pukes[i].setZifu(zufus[i - (2 * zufus.length)]);
			}
			if (i >= 39 && i <= 51) {
				pukes[i].setHuase(huases[3]);
				pukes[i].setZifu(zufus[i - (3 * zufus.length)]);
			}
			if (i == 52) {
				pukes[i].setHuase("");
				pukes[i].setZifu("大王");
			}
			if (i == 53) {
				pukes[i].setHuase("");
				pukes[i].setZifu("小王");
			}
		}
	}

	/**
	 * 获取花色
	 */
	private static String[] getHuaSe() {
		String[] huases = new String[4];
		for (int i = 0; i < huases.length; i++) {
			if (i == 0) {
				huases[i] = "黑桃";
			} else if (i == 1) {
				huases[i] = "红桃";
			} else if (i == 2) {
				huases[i] = "方块";
			} else if (i == 3) {
				huases[i] = "梅花";
			}
		}
		return huases;
	}

	/**
	 * 获取字符
	 */
	private static String[] getZiFu() {
		String[] zifus = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		return zifus;
	}

	public static Pukes getPukes() {
		if (pukes1==null) {
			pukes1 = new Pukes();
		}
		return pukes1;
	}
	public static Puke[] getPuke() {
		setPukes();
		return pukes;
	}
	@Override
	public String toString() {
		return "Pukes [pukes1=" + pukes1 + "]";
	}

}
