package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.config.BeansConfig;
import com.spring.dto.Director;
import com.spring.dto.Employee;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Ioc.xml");
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfig.class);
		Employee employee = (Employee) context.getBean("employee");
		Director director = (Director) context.getBean("director");
		Employee emloyee2 = (Employee) context.getBean("employee2");
//		System.out.println("Name: " + director.getTenNhanVien() + " Age: " + director.getAge() + " Chuc Vu: " + director.getChucVu());
//		((ClassPathXmlApplicationContext) context).close();
		
		emloyee2.getList().stream().forEach(System.out::println);
		emloyee2.getListDirector().stream().forEach(System.out::println);
		
		System.out.println(emloyee2.getProperties().getProperty("jdbc"));
	}
}
