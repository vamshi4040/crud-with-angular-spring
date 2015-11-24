package com.angulaeApp.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;
@Transactional
public interface BaseDAO {

	<T> T getObject(Class<T> clazz, Serializable id);
	
	<T> List<T> getObjects(Class<T> clazz);
	
	void saveObject(Object o);
	
	<T> void removeObject(Object o);
}
