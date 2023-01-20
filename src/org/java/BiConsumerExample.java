package org.java;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		
		BiConsumer<Person, Person> biConsumer= (p1,p2) ->
		{
			System.out.println(p1.getName());
			System.out.println(p2.getName());
		};
		
		Person person1=new Person("Aman", 20);
		Person person2=new Person("Kumar", 21);
		
		biConsumer.accept(person1, person2);
	}

}
