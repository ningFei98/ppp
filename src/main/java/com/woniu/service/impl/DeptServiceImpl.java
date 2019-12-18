package com.woniu.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IDeptDAO;
import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;
@Service
@Transactional
public class DeptServiceImpl implements IDeptService {

	@Autowired
	IDeptDAO dd;
	@Override
	public void save(Dept obj) {
		dd.save(obj);
//		System.out.println(1/0);
//		Dept d = new Dept();
//		d.setDloc("ggg");
//		d.setDname("mmm");
//		dd.save(d);
	}

	@Override
	public List<Dept> findAll() {
		
		return dd.findAll();
	}

}
