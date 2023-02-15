package com.fullstack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.Repository.Stdrepo;
import com.fullstack.model.Students;

@Service
public class Myserviceimp implements Myserviceinterface{
	@Autowired
	
	Stdrepo repo;

	@Override
	public List<Students> addall(Students student) {
		List<Students>getall = repo.findAll();
		return getall;
	}

	@Override
	public Students saveall(Students student) {
		Students saveall = repo.save(student);
		return saveall;
	}

	
	
	

}
