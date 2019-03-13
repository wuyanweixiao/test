package com.lianchuang.dao;

public class InjectionDaoImpl implements InjectionDao {
	public void save(String arg){
		System.out.println("dao保存信息："+arg);
	}
}
