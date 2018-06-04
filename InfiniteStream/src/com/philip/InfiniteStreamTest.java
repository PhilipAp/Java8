package com.philip;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfiniteStreamTest {

	public static void main(String[] myArgs) {
		Supplier<UUID> randomUUIDs = UUID::randomUUID;
		Stream<UUID> generatedUUIDs = Stream.generate(randomUUIDs);
		List<UUID> collectUUIDs =  generatedUUIDs.skip(10)
		                           .limit(10)
		                           .collect(Collectors.toList());
		           collectUUIDs.forEach(System.out::println);

        System.out.println("--------------------------------------------");	
        
        Stream<Integer> iterate = Stream.iterate(0, i->i+1);
                        iterate.limit(10)
                               .forEach(System.out::println);
		           
     		           
	}

}
