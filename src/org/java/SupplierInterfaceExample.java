package org.java;

import java.util.function.Supplier;

public class SupplierInterfaceExample {

	public static void main(String[] args) {
		
		//Gets a result
		Supplier<Person>  supplier= () -> {return new Person("Raman",25);};
		
		System.out.println(supplier.get().getName());
		System.out.println(supplier.get().getAge());

	}

}
