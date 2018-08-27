package com.model;

import java.io.Serializable;

public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double salary;
	private String departmentName;
	
	public Employee(String name, Double salary, String departmentName) {
		super();
		this.name = name;
		this.salary = salary;
		this.departmentName = departmentName;
	}
	
	public Employee(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", departmentName=" + departmentName + "]";
	}
	
	
	

}
