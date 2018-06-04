package com.infotech.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.infotech.model.Employee;

public class ClientTest {

	public static void main(String[] args) {
      Map<Integer, Employee> map = new HashMap<>();
      map.put(19022, new Employee("Philip", "philip@gmail.com", 19000.00));
      map.put(19033, new Employee("Abigail", "abigail@gmail.com", 10000.00));
      map.put(19044, new Employee("Rex", "rex@gmail.com", 12000.00));
      map.put(19055, new Employee("Victoria", "victoria@gmail.com", 9000.00));
      
      Set<Entry<Integer, Employee>> entrySet = map.entrySet();
      for(Entry<Integer, Employee> entry: entrySet) {
    	 System.out.println(entry.getKey()); 
    	 System.out.println(entry.getValue());
      }
      
      System.out.println("-------------------------------------------------------");
      Set<Integer> keySet = map.keySet();
      for(Integer key : keySet) {
    	  System.out.println(key);
    	  System.out.println(map.get(key));
      }
      
      System.out.println("-------------------------------------------------------");
      map.forEach((k,v)-> System.out.println(k+"\t"+v));
	}

}
