package org.java;

import java.util.function.BiFunction;
import java.util.function.Function;

class MethodReference
{
	public static int addition(int a, int b)
	{
		return a+b;
	}
	
	public void multiplication(int a, int b)
	{
		System.out.println(a * b);
	}
	
}


public class MethodReferenceExample {

	public static void main(String[] args) {
		
		BiFunction<Integer,Integer, Integer> functionLambdaEx=(a,b) ->  MethodReference.addition(a, b);
		System.out.println(functionLambdaEx.apply(10, 20));
		
		
		//static reference
		BiFunction<Integer,Integer, Integer> functionalReference=MethodReference::addition;
		
		System.out.println(functionalReference.apply(10, 20));
		
		
		
		
		
	}

}
