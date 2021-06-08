package com.spring.dto;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Employee {
	private String tenNhanVien;
	private String diaChi;
	private int age;
	private Director director;
	private List<String> list;
	private List<Director> listDirector;
	private Map<String, Object> map;
	private Properties properties;
	
	
	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee() {

	}
	
	public Employee(Director director) {
		this.setDirector(director);
	}

	public Employee(String tenNhanVien, int age) {
		this.tenNhanVien = tenNhanVien;
		this.age = age;
	}

	public Employee(String tenNhanVien, int age, String diaChi) {
		this.tenNhanVien = tenNhanVien;
		this.age = age;
		this.diaChi = diaChi;
	}

	public void Notify() {
		System.out.println("This is employee class");
	}

	public void Start() {
		System.out.println("Hello bạn " + tenNhanVien);
	}

	public void Destroy() {
		System.out.println("Goodbye bạn " + tenNhanVien);
	}

	public Employee createEmployee() {
		Employee em = new Employee();
		em.setTenNhanVien("Huỳnh Bá Thắng");
		return em;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public List<Director> getListDirector() {
		return listDirector;
	}

	public void setListDirector(List<Director> listDirector) {
		this.listDirector = listDirector;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}
}
