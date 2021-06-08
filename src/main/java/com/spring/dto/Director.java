package com.spring.dto;

public class Director extends Employee {
	private String chucVu;

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	
	public Director(String chucVu, String tenNhanVien, int age) {
		super(tenNhanVien, age);
		this.chucVu = chucVu;
	}
	
	@Override
	public String toString() {
		return "Director{" + "name: " + getTenNhanVien() + ", tuoi: " + getAge()
				+ ", chuc vu: " + chucVu + "}"; 
	}
	
}
