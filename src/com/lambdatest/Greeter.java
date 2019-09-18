package com.lambdatest;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[]args) {
		
		//Greeter greeter = new Greeter();
		//HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		//greeter.greet(helloWorldGreeting);
		
		Greeting lambdaGreeting = () -> System.out.println("Hello world!");
		lambdaGreeting.perform();
	}
}
