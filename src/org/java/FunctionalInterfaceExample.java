package org.java;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
	
		//Lambda expression
		Sayable sayable=(msg) -> {
			System.out.println(msg);
		};
		
		sayable.say("Hello World!!");

	}
}
