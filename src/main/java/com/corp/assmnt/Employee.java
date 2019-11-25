package com.corp.assmnt;
/**
 * 
 * @author shahjade.a
 *
 */
public class Employee {

	private String name;
	private String surName;
	private int number;
	private String department;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee(String name, String surName, int number, String department) {
		super();
		this.name = name;
		this.surName = surName;
		this.number = number;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", surName=" + surName + ", number=" + number + ", department=" + department
				+ "]";
	}
	
	
}
