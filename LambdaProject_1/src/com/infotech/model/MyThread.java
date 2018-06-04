package com.infotech.model;

public class MyThread implements Runnable{

	@Override
	public void run() {
		//Your Service method to execute in a thread in real scenario
		System.out.println("My task is executing .. ");
	}

}
