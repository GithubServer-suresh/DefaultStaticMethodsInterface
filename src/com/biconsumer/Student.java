package com.biconsumer;

public class Student {

	private String name;
	private Long phone;
	public Student(String name, Long phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + "]";
	}
	
	
}
