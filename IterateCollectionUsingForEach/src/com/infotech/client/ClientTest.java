package com.infotech.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.infotech.model.Student;

public class ClientTest {

	public static void main(String[] args) {
     List<Student> studentList = new ArrayList<>();
     studentList.add(new Student("Philip", 38));
     studentList.add(new Student("Stephen", 30));
     studentList.add(new Student("Judith", 40));
     
    //studentList.forEach((s)->{System.out.println(s);});
     
     //Simplified version
     studentList.forEach(System.out::println);
     
     System.out.println("----------------------------------------------------");
     
     for(Student student:studentList) {
    	 System.out.println(student);
     }
     
     System.out.println("----------------------------------------------------");
     
     Iterator<Student> iterator = studentList.iterator();
     while(iterator.hasNext()) {
    	 System.out.println(iterator.next());
     }
     
	}

}

/*class MyConsumer implements Consumer<Student>{

	@Override
	public void accept(Student student) {
      System.out.println(student);  		
	}
	
	
}
*/