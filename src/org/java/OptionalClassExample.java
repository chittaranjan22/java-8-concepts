package org.java;

import java.util.Optional;  

public class OptionalClassExample {

	public static void main(String[] args) {
		//empty optional
		//empty - Returns an Optional describing the given non-nullvalue.
		Optional<String> gender=Optional.empty();
		System.out.println(gender);
		
		if(gender.isPresent())
		{
		 System.out.println(gender.get());
		}
		//Non-empty optional
		//of - Returns an Optional describing the given non-nullvalue.
		Optional<String> name=Optional.of("Java");
		System.out.println(name);
		
		if(name.isPresent())
		{
		 System.out.println(name.get());
		}
		
		//ofNullable - If a value is present, performs the given action with the value,otherwise does nothing.
		Optional<String> city=Optional.ofNullable(null);
		if(city.isEmpty())
		{
			System.out.println(city);
		}
		else
		{
			System.out.println(city.get());
		}
		
		//ifPresent - If a value is present, performs the given action with the value,
		//otherwise does nothing.
		Optional<String> opt=Optional.ofNullable(null);
		
		opt.ifPresent(s -> System.out.println(s.length()));
		
		//isEmpty - true if a value is not present, otherwise false
		Optional<String> test=Optional.ofNullable("Java");
		System.out.println(test.isEmpty());
		
		
		//orElse - Return the value if present otherwise returns another.
		String currentlanguage=null;
		String language=Optional.ofNullable(currentlanguage).orElse("Python");
		System.out.println(language);
		
		
		//orElseGet - If a value is present, returns the value, otherwise returns 
		//the resultproduced by the supplying function.
		
		String nullName=null;
		String userName=Optional.ofNullable(nullName).orElseGet(() -> "Aman");
		System.out.println(userName);
		
		
		//orElseThrow - If a value is present, returns the value, otherwise throws NoSuchElementException.
		
		userName=Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
		System.out.println(userName);
		
	}

}
