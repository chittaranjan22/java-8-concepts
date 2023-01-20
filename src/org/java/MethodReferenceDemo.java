package org.java;
interface Printable
{
	
	void print(String msg);
}



public class MethodReferenceDemo {

	
	public void display(String msg)
	{
		System.out.println(msg);
	}
	
	
	public static void main(String[] args) {
	
		MethodReferenceDemo ob=new MethodReferenceDemo();
		Printable printable=(msg) ->ob.display(msg);
		
		printable.print("Hello World!!");
		
		
		Printable printable1=ob::display;
		printable1.print("Hello Java!!");
		
		

	}

}
