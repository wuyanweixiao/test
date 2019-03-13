package com.lianchuang.dao;

public class AutoWareDaoImpl implements AutoWareDao {

	public String say(String word) {
	System.out.println("AutoWareDaoImpl: "+word);
	return word;
	}

}
