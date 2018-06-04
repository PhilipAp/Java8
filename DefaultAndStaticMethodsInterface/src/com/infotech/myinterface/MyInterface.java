package com.infotech.myinterface;

import java.util.Collections;
import java.util.List;

import com.infotech.model.Student;

public interface MyInterface {
	
	default public List<Student> sortStudents(List<Student> studentList){
		Collections.sort(studentList);
		return studentList;
	}
	
	static public void greet(String name) {
		System.out.println("Welcome: "+name);
		
	}
	
	public abstract Integer getMaxNum(List<Integer> integerList);

}
