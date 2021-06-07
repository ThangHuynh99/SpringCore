package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.dto.Employee;

@Configuration
@ComponentScan("com.spring")
public class BeansConfig {
	
	@Bean
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setTenNhanVien("Huỳnh Bá Thắng");
		return employee;
	}
	
}
