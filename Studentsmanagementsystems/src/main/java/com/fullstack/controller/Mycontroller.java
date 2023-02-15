package com.fullstack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fullstack.model.Students;
import com.fullstack.service.Myserviceinterface;

@Controller

public class Mycontroller {
	@Autowired
	
	Myserviceinterface service;

	@GetMapping("/getall")

	public String getall(Students student, Model model) {
		List<Students> getall = service.addall(student);
		model.addAttribute("Students", service.addall(student));
		return "student.html";
	}

	@PostMapping("/saveall")
	public Students post( @RequestBody Students student) {
		Students save = service.saveall(student);
		return save;
	}
	
}
