package com.philip;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("Paparazzi");
		list.add("Lounge");
		list.add("Bella");
		list.add("Roma");
		list.add("Ashok");

		Stream<String> stream = list.stream();
		Stream<String> distinct = stream.distinct();
		long count = distinct.count();
		System.out.println(count);
	}

}
