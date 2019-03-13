package com.lianchuang.puke;

import org.junit.Test;

public class Pukes {
	public static String[][] getPukes() {
		String a[][] = new String[5][13];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == 4) {
					if (j == 1) {
						int j1 = -1;
						a[i][j] = fuzhi1(i + 1) + fuzhi2(j1);
						break;
					}
					j = 0;
					a[i][j] = fuzhi1(i + 1) + fuzhi2(j);
					continue;
				}
				a[i][j] = fuzhi1(i + 1) + fuzhi2(j + 1);
			}
		}

		return a;
	}

	public static String fuzhi1(int i) {
		switch (i) {

		case 1:
			return "[红桃";
		case 2:
			return "[黑桃";
		case 3:
			return "[方块";
		case 4:
			return "[梅花";
		case 5:
			return "[";
		default:
			return null;
		}
	}

	public static String fuzhi2(int j) {
		switch (j) {
		case -1:
			return "小王]";
		case 0:
			return "大王]";
		case 1:
			return "A]";
		case 11:
			return "J]";
		case 12:
			return "Q]";
		case 13:
			return "K]";
		default:
			return j + "]";
		}
	}

	@Test
	public void test() {
		String puke[] = getFaliyPuke();
		for (int i = 0; i < puke.length; i++) {
			if (i == 12 || i == 25 || i == 38 || i == 51) {
				System.out.println(puke[i]);
			} else if (i == 53) {
				System.out.println(puke[i]);
			} else {
				System.out.print(puke[i] + ",");
			}
		}
	}

	public static String[] getFaliyPuke() {
		String pukes[][] = getPukes();
		String puke[] = new String[54];
		int i = 0;
		for (int j1 = 0; j1 < pukes.length; j1++) {
			for (int j2 = 0; j2 < pukes[j1].length; j2++) {
				if (i > 53) {
					break;
				}
				if (pukes[j1][j2] != null) {
					puke[i] = pukes[j1][j2];
					i++;
				} else {
					continue;
				}
			}
		}
		//开始洗牌了
		for (int j = 0 ,len = puke.length ; j < puke.length; j++) {
			int index = (int) (Math.random() * len);//1:10  // 2:10
            String temp = puke[index];// temp=puke[10]{HA}	// temp=puke[10]{HB}
            puke[index] = puke[j];//puke[10] = puke[0]{HB} //puke[10] = puke[1]{HC}
            puke[j] = temp;		//puke[0] = HA  puke[10] = HB ////puke[1] = HB  puke[10] = HC
		}
		
		return puke;
	}
}
