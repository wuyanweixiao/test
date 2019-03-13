package com.lianchuang.puke;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.junit.Test;

public class Test1 {
	@Test
	public void test1(){
		String puke[] = Pukes.getFaliyPuke();
		String dipai[] = new String[3];
		int a = (int) (2+Math.random()*(puke.length-2));
		String dizhu = puke[a];
		Player p1 = new Player();
		String p11[] =new String[17];
		int p111 =0;
		Player p2 = new Player();
		int p222 =0;
		String p22[] =new String[17];
		Player p3 = new Player();
		int p333 =0;
		String p33[] =new String[17];
		Player p[] =new Player[3];		
		for (int i = 0; i < puke.length; i++) {
		if(puke[i].equals(dizhu)){
			if (i<=2) {
				dipai[i] = puke[i];
			}else if(i%3==1){
				p11[p111] = puke[i];
				p111++;
				p1.setDizhu(true);
			}else if(i%3==2){
				p22[p222] = puke[i];
				p222++;
				p2.setDizhu(true);
			}else if(i%3==0){
				p33[p333] = puke[i];
				p333++;
				p3.setDizhu(true);
			}
		}else{
			if (i<=2) {
				dipai[i] = puke[i];
			}else if(i%3==1){
				p11[p111] = puke[i];
				p111++;
			}else if(i%3==2){
				p22[p222] = puke[i];
				p222++;
			}else if(i%3==0){
				p33[p333] = puke[i];
				p333++;
			}
		}
		}
		p1.setPuke(p11);
		p2.setPuke(p22);
		p3.setPuke(p33);
		p[0]= p1;
		p[1]= p2;
		p[2]= p3;
		System.out.println("底牌是：");
		for (int i = 0; i <3; i++) {
		System.out.print(dipai[i]+",");	
		}
		System.out.println();
		System.out.println("地主是：");
		for (int i = 0; i < p.length; i++) {
			if (p[i].dizhu) {
				System.out.println("p"+(i+1));
			}
		}
		System.out.println("地主牌是："+dizhu);
		System.out.println("p1的牌是：");
		for (int i = 0; i < p1.getPuke().length; i++) {
			System.out.print(p1.getPuke()[i]+",");
		}
		System.out.println();
		System.out.println("p2的牌是：");
		for (int i = 0; i < p2.getPuke().length; i++) {
			System.out.print(p2.getPuke()[i]+",");
		}
		System.out.println();
		System.out.println("p3的牌是：");
		for (int i = 0; i < p3.getPuke().length; i++) {
			System.out.print(p3.getPuke()[i]+",");
		}
	}
	
}
