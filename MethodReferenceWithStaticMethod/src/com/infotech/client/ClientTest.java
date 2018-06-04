package com.infotech.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientTest {

	public static void main(String[] args) {
    
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		//static method reference
		Runnable command = ClientTest::myRun;
		executorService.execute(command);
	}
	
	//static method
	private static void myRun() {
		System.out.println("My Task is executing .. ");
	}

}
