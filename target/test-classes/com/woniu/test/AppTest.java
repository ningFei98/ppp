package com.woniu.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.woniu.dao.IDeptDAO;
import com.woniu.pojo.Dept;

public class AppTest {



	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IDeptDAO dd = ac.getBean(IDeptDAO.class);
		Dept dept = new Dept();
		dept.setDname("kkk");
		dept.setDloc("hhh");
		dd.save(dept);
	}

}
