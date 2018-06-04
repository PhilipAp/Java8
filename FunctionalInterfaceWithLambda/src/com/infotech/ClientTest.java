package com.infotech;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {
		
		
		List<String> nameList = new ArrayList<>();
		nameList.add("Philip");
		nameList.add("Jason");
		nameList.add("Abigail");
		nameList.add("Ampah");
		
		/*nameList.forEach(new Consumer<String>() {

			@Override
			public void accept(String name) {
				System.out.println(name);				
			}
		});	*/
		
		// Changing the consumer which is FunctionalInterface to Lambda we have
		//nameList.forEach((String name) -> System.out.println(name));
		
		//By method reference we have below 
		nameList.forEach(System.out::println);
		}
         
        //createThreadUsingLambdaExpression();
	private static void createThreadUsingLambdaExpression() {
    Runnable r = () -> {System.out.println("My task is executing ..");};
		Thread thread = new Thread(r);
		thread.start();	
		
	}
	
	
	   //createThreadUsingAnonymousClass();	
	private static void createThreadUsingAnonymousClass() {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				//Business logic here
				System.out.println("My task is executing ..");				
			}
		};
		
		Thread thread = new Thread(r);
		thread.start();
	}

}
