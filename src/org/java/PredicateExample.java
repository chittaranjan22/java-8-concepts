package org.java;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		
		Person person1=new Person("Aman", 20);
		Person person2=new Person("Kumar", 21);
		Person person3=new Person("Shalini", 23);
		
		
		//Predicate function interface
		Predicate<Person> predicate=(person)-> person.getAge()>20; 
		
		boolean result=predicate.test(person3);
		
		System.out.println(result);
		
		
	
	}

}
