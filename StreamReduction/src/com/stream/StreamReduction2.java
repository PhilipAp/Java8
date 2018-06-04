package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamReduction2 {

	public static void main(String[] args) {
		List<Product> productList = Arrays.asList(new Product(32, "Fish"),
				                                  new Product(10, "Tomato"),
				                                  new Product(22, "Potato"),
				                                  new Product(33, "Sardines"),
				                                  new Product(45, "Mackerel"),
				                                  new Product(38, "Powdered Milk"));
		
		List<String> collectedProducts = productList.stream()
				                          .map(Product::getName)
				                          .collect(Collectors.toList());
		             collectedProducts.forEach(System.out::println);
		             
       System.out.println("------------------------------------------------------");
       
       String productToString = productList.stream().map(Product::getName).collect(Collectors.joining(",", " [ ", " ] "));
       System.out.println(productToString);
       
       System.out.println("------------------------------------------------------");
       
       Double averagaPrice = productList.parallelStream().collect(Collectors.averagingInt(Product::getPrice));
       System.out.println(averagaPrice);
	}

}
