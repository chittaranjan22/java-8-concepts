package org.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StreamUsingCollection {

	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<>();
		set.add(11);
		set.add(13);
		set.add(14);
		set.add(17);
		set.add(23);
		
		
		set.stream()
		  .sorted()
		  .map(x-> x*x)
		  .forEach(x -> System.out.println(x));
		
		
		Map<String, String> map=new HashMap<>();
		map.put("0", "Red");
		map.put("1", "Blue");
		map.put("2", "Green");
		
		map.entrySet()
		  .stream()
		  .forEach((x)->
		  
		  {
			  System.out.println(x.getKey()); 
			  System.out.println(x.getValue());}
		  );
		
	}

}
