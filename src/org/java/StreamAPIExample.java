package org.java;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExample {

	public static void main(String[] args) {
		
		//Stream<String> stream=Stream.empty();
		//stream.forEach(System.out::println);//Functional Reference
		
		
		Collection<String> collection=Arrays.asList("Java","C","C++","J2EE","Sping","Hibernate");
		Stream<String> stream=collection.stream();
		stream.forEach(System.out::println);
		System.out.println("====================================");
		
		//Array can also be a source of Stream
		Stream<String> streamOfArray=Stream.of("a","b","c");
		streamOfArray.forEach(System.out::println);
		System.out.println("====================================");
		
		//creating from existing array 
		String[] arr=new String[] {"a","b","c"};
		Stream<String> streamOfArrayFull=Arrays.stream(arr);
		streamOfArrayFull.forEach(System.out::println);
		
		System.out.println("====================================");
		Stream<String> streamOfArrayPart=Arrays.stream(arr,0,3);
		streamOfArrayPart.forEach(System.out::println);
		
		
		
		List<Integer> numbers=Arrays.asList(2,5,7,17,6,11,13,90);
		
		List square=numbers.stream()
				.map(x -> x*x)
				.collect(Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(square);
		
		
		List filteredResult=numbers.stream()
				.filter(x -> x%2==0)
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(filteredResult);
		
		
		List<String> names= Arrays.asList("India","Srilanka","USA","Pakistan","UK");
		List<String> filteredNames= names.stream()
				.filter(x-> x.endsWith("A"))
				.filter(x-> x.startsWith("U"))
				.sorted()
				.map(a-> a.toLowerCase())
				.collect(Collectors.toList());
		System.out.println(filteredNames);
		
		
		
		Set<Integer> set = new HashSet<>();
	     
	    // adding elements in set
	    set.add(2);
	    set.add(4);
	    set.add(6);
	    set.add(8);
	    set.add(10);
	    set.add(12);
	    Stream<Integer> stream1 = set.stream();
	    stream1.forEach(elem->System.out.print(elem+" "));	
	}

}
