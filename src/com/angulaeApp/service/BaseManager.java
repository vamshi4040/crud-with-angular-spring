package com.angulaeApp.service;

import java.io.Serializable;
import java.util.List;

public interface BaseManager {
	<T> T getObject(Class<T> clazz, Serializable id);

	<T> List<T> getObjects(Class<T> clazz);

	void saveObject(Object o);
	
	<T> void removeObject(Object o);
}
