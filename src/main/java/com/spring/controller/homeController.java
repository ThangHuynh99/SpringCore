package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.dto.Employee;
import com.spring.service.Hahaa;

@Controller
public class homeController {
	@Autowired
	private Hahaa haha;
	
	@Autowired
	private Employee employee;
	
	@RequestMapping("/home")
	@ResponseBody
	public String hello() {
		String name = haha.print();
		return  employee.getTenNhanVien();
	}
}
