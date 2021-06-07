package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.config.BeansConfig;
import com.spring.dto.Employee;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Ioc.xml");
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		Employee employee = (Employee) context.getBean("employee");
		employee.Notify();
		System.out.println("Name: " + employee.getTenNhanVien());
		((ClassPathXmlApplicationContext) context).close();
	}
}
