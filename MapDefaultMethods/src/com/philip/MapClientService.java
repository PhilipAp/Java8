package com.philip;

import java.util.HashMap;
import java.util.Map;

public class MapClientService {

	public static void main(String[] args) {
		Map<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(1901, "Philip");
		employeeMap.put(1902, "Louis");
		employeeMap.put(1903, "Donkoh");
		employeeMap.put(1904, "Stephen");
		employeeMap.put(1905, "Judith");
		employeeMap.put(1906, "George");
		
		String result = employeeMap.getOrDefault(1903, "Esther");
		System.out.println(result);
		
		System.out.println("----------------------------------");
		employeeMap.forEach((k, v)->System.out.println(k+"\t"+v));
		
		System.out.println("----------------------------------");
	}

}
