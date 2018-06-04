package com.philip.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.philip.model.Employee;

public class ClientTest {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Nanor", 32));
		employeeList.add(new Employee("Judith", 28));
		employeeList.add(new Employee("Michael", 35));
		employeeList.add(new Employee("Philip", 26));
		employeeList.add(new Employee("Stephen", 30));
		
		System.out.println("Before sorting the list");
		for (Employee employee : employeeList) {
			System.out.println(employee);			
		}
		
		System.out.println("-------------------------------------");
		
		Collections.sort(employeeList, (e1,e2)-> e1.getName().compareTo(e2.getName()));
		System.out.println("After sorting the list");
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}

}
