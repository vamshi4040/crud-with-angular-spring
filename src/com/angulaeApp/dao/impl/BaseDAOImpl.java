package com.angulaeApp.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.angulaeApp.dao.BaseDAO;

@Transactional
public class BaseDAOImpl extends HibernateDaoSupport implements BaseDAO{

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getObject(Class<T> clazz, Serializable id) {
		return getHibernateTemplate().get(clazz, id);
	}

	@Override
	public <T> List<T> getObjects(Class<T> clazz) {
		return getHibernateTemplate().loadAll(clazz);
	}

	@Override
	public void saveObject(Object o) {
		getHibernateTemplate().saveOrUpdate(o);
	}

	@Override
	public <T> void removeObject(Object o) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(o);
		
	}

}
