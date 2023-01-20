package org.java;

import java.util.function.Function;

public class FunctionInterfaceExample {

	public static void main(String[] args) {
		
		//convert centigrade to fahrenheit
		Function<Integer, Double> centigrateToFahrenheit= (x) -> new Double((x * 9  / 5)	+ 32);
		System.out.println(centigrateToFahrenheit.apply(0));
		

	}

}
