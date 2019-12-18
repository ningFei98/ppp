package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;

@Controller
public class DeptAction {
	@Autowired
	private IDeptService ds;
	private Dept dept;
	private List<Dept> depts;
	

	public List<Dept> getDepts() {
		return depts;
	}
	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	public String save() {
		ds.save(dept);
		return "success";
	}
	
	public String findAll() {
		depts = ds.findAll();
		return "success";
	}
}
