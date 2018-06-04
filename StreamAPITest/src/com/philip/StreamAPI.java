package com.philip;

import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		Stream<String> streamBuilder = Stream.<String>builder().add("Ama")
		                                               .add("Yaa")
		                                               .add("Abena")
		                                               .add("Akua")
		                                               .build();
		               streamBuilder.forEach(System.out::println);
		               
    System.out.println("-------------------------------------------");	
    
    Stream<String> generate = Stream.generate(()->"Philip is a Java geek")
    		                         .limit(10);
    		                         generate.forEach(System.out::println);
	}

}
