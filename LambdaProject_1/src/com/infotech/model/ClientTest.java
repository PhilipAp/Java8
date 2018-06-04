package com.infotech.model;

public class ClientTest {

	public static void main(String[] args) {		
		createThreadUsingLambda();
		//createThreadWithoutLambda();

	}

	private static void createThreadUsingLambda() {
		Runnable r = () -> System.out.println("My task is executing .. ");
		Thread thread1 = new Thread(r);
		thread1.start();
		
	}

	private static void createThreadWithoutLambda() {
		//Create Runnable object first
		MyThread myThread = new MyThread();
		
		//Create thread object and pass runnable object to it
		Thread thread1 = new Thread(myThread);
		thread1.start();
	}

}
