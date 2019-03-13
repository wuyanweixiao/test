package com.lianchuang.service;

import com.lianchuang.dao.InjectionDaoImpl;

public class InjectionServiceImpl implements InjectionService {
	private InjectionDaoImpl injectionDao;
	
	public void setInjectionDao(InjectionDaoImpl injectionDao) {
		this.injectionDao = injectionDao;
	}

	public void save(String arg){
		System.out.println(arg);
		arg = arg+"----经过了service";
		injectionDao.save(arg);
	}


}
