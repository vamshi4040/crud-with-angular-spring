package com.angulaeApp.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angulaeApp.dao.BaseDAO;
import com.angulaeApp.service.BaseManager;

@Service
public class BaseManagerImpl implements BaseManager {
	
	@Autowired
	private BaseDAO baseDAO;

	@Override
	public <T> T getObject(Class<T> clazz, Serializable id) {
		return baseDAO.getObject(clazz, id);
	}

	@Override
	public <T> List<T> getObjects(Class<T> clazz) {
		return baseDAO.getObjects(clazz);
	}

	@Override
	public void saveObject(Object o) {
		baseDAO.saveObject(o);
	}

	@Override
	public <T> void removeObject(Object o) {
		baseDAO.removeObject(o);
	}

}
