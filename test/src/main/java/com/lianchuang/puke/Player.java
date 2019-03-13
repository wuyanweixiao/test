package com.lianchuang.puke;

public class Player {
	String puke[];
	boolean dizhu;
	public String[] getPuke() {
		return puke;
	}

	public void setPuke(String[] puke) {
		this.puke = puke;
	}

	public Player(String[] puke) {
		super();
		this.puke = puke;
	}

	public Player() {
		super();
	}

	public boolean isDizhu() {
		return dizhu;
	}

	public void setDizhu(boolean dizhu) {
		this.dizhu = dizhu;
	}
	
}
