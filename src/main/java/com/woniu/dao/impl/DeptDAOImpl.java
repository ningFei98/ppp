package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IDeptDAO;
import com.woniu.pojo.Dept;
@Repository
public class DeptDAOImpl implements IDeptDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void save(Dept obj) {
		sessionFactory.getCurrentSession().save(obj);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dept> findAll() {
		return sessionFactory.getCurrentSession().createCriteria(Dept.class).list();
	}

}
