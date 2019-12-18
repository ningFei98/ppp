package com.woniu.dao;

import java.util.List;

import com.woniu.pojo.Dept;

public interface IDeptDAO {
	
	void save (Dept obj);
	List<Dept> findAll ();

}
