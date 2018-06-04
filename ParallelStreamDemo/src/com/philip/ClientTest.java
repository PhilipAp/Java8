package com.philip;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Frank", 41));
		studentList.add(new Student("Ama", 49));
		studentList.add(new Student("Yaa", 31));
		studentList.add(new Student("Boamah", 98));
		
		
		Stream<Student> parallelStream =  studentList.parallelStream();
		System.out.println("Student data sent for processing");
		parallelStream.forEach(s->doProcess(s));

	}

	private static void doProcess(Student s) {
		System.out.println(s);
	}

}
