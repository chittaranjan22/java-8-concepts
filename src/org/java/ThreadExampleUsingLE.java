package org.java;

public class ThreadExampleUsingLE {

	public static void main(String[] args) {
	
		Runnable thread=() -> {
			for(int i=1;i<=10;i++)
			{
				System.out.println(i);
			}
			};
			
			thread.run();

	}

}
