package org.java;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
		
		BiPredicate<String, String> biPredicate=new BiPredicate<String, String>() {
			
			@Override
			public boolean test(String t, String u) {
				
				return t.equals(u);
			}
		};
		
		System.out.println(biPredicate.test("JAVA", "JAVA"));

	}

}
