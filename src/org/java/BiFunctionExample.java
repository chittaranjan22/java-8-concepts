package org.java;

import java.util.function.BiFunction;

public class BiFunctionExample {

	public static void main(String[] args) {
		
		BiFunction<Person, Person, Integer> biFunction= (p1, p2) -> {
			return p1.getAge() + p2.getAge();
		};
		
		
		Person person1=new Person("Aman", 20);
		Person person2=new Person("Kumar", 21);
		
		System.out.println(biFunction.apply(person1, person2));

	}

}
