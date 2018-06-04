package com.client;

import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

public class ClientService {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee("Kwame", 81200.12, "Oracle"));
		employeeList.add(new Employee("Kofi", 71200.13, "Software"));
		employeeList.add(new Employee("Kwesi", 61200.14, "Software"));
		employeeList.add(new Employee("Yaw", 51200.15, "Oracle"));
		employeeList.add(new Employee("Kwabena", 41200.16, "Oracle"));		
		employeeList.add(new Employee("Kweku", 31200.17, "Software"));
		employeeList.add(new Employee("Abena", 21200.18, "Software"));
		employeeList.add(new Employee("Yaa", 11200.19, "Software"));
		
		System.out.println("PRINTING EMPLOYEE LIST");		
		employeeList.forEach(s -> System.out.println(s));
		
		System.out.println("----------------------------------------------------");
		System.out.println("REMOVING EMPLOYEES IN ORACLE DEPARTMENT");
		employeeList.removeIf(s -> "Oracle".equalsIgnoreCase(s.getDepartmentName()));
		employeeList.forEach(s -> System.out.println(s));
		
		System.out.println("----------------------------------------------------");
		System.out.println("EMPLOYEE LIST SORTED BY SALARY");
		employeeList.sort((e1, e2)->e1.getSalary() > e2.getSalary() ?1:-1);
		employeeList.forEach(s -> System.out.println(s));
		
		System.out.println("----------------------------------------------------");
		System.out.println("REPLACING ALL EMPLOYEE SALARIES");
		employeeList.replaceAll(e ->{
			if(e.getSalary() > 60000.00 ) {
				return e;
			}else {
				e.setSalary(e.getSalary()+e.getSalary() * 0.1);
				return e;
			}			
		});
		employeeList.forEach(s -> System.out.println(s));		
	}

}
