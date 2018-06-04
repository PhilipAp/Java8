package com.philip;

import java.util.stream.Stream;

public class ClientTest {

	public static void main(String[] args) {
		Stream<String> onceModifiedStream = Stream.of("abc1", "bcd2", "xyz3")
				                           .skip(1);
		               onceModifiedStream.forEach(System.out::println);
		               
        System.out.println("---------------------------------------------");
        
        Stream<String> twiceModifiedStream = Stream.of("abc1", "bcd2", "xyz3","mnp4")
                                            .skip(1)
                                            .map(t -> t.substring(0, 3))
                                            .sorted();
            long count = twiceModifiedStream.count();
            System.out.println(count);
	}

}
