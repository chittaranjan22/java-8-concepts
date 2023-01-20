package org.java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {

	public static void main(String[] args) {
		
		Person person1=new Person("Aman", 20);
		Person person2=new Person("Kumar", 21);
		Person person3=new Person("Shalini", 23);
		
		
		
		Consumer<Person> consumer=(person) -> {
			System.out.println(person.getName());
			System.out.println(person.getAge());
		};
		
		consumer.accept(person1);
		}
	
	
}
