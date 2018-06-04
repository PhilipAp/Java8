package com.infotech.client;

import java.util.ArrayList;
import java.util.List;

import com.infotech.model.Student;
import com.infotech.myinterface.MyInterface;
import com.infotech.myinterfaceImpl.MyInterfaceImpl;

public class ClientTest {

	public static void main(String[] args) {
		MyInterface myInterface = new MyInterfaceImpl();
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Philip", 20));
		studentList.add(new Student("Abigail", 18));
		studentList.add(new Student("Rex", 16));
		
		List<Student> sortStudents = myInterface.sortStudents(studentList);
		for(Student student: sortStudents) {
			System.out.println(student.getName()+"\t"+student.getAge());
		}
		
		System.out.println("-------------------------------------------------");
		
		MyInterface.greet("Philip");
		
		System.out.println("-------------------------------------------------");
		
		List<Integer> integerList = new ArrayList<>();
		integerList.add(1000);
		integerList.add(90);
		integerList.add(50);
		integerList.add(9000);
		Integer maxNum = myInterface.getMaxNum(integerList);
        System.out.println("Maximum Number :"+maxNum);
	}

}
