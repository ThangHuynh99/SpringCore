package com.spring.dto;

public class Employee {
	private String tenNhanVien;
	private String diaChi;
	private int age;
	
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
	
	public void Notify() {
		System.out.println("This is employee class");
	}
	
	public void Start() {
		System.out.println("Hello bạn " + tenNhanVien );
	}
	
	public void Destroy() {
		System.out.println("Goodbye bạn " + tenNhanVien );
	}
}
