package com.lambdatest;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(() -> System.out.println("Printed inside runnable"));
				

		
		myThread.run();

	}

}
