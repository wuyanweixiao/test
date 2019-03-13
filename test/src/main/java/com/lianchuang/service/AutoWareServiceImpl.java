package com.lianchuang.service;


import com.lianchuang.dao.AutoWareDaoImpl;

public class AutoWareServiceImpl implements AutoWareService {
	private AutoWareDaoImpl autoWareDao;

	public AutoWareDaoImpl getAutoWareDao() {
		return autoWareDao;
	}

	public void setAutoWareDao(AutoWareDaoImpl autoWareDao) {
		this.autoWareDao = autoWareDao;
	}

	public void say(String word) {
		System.out.println( "AutoWareServiceImpl: "+word);

	}

}
