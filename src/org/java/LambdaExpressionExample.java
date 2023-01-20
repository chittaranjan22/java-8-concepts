package org.java;

interface Test
{
	void test(int a,int b);
}

interface Test1
{
	int test(int a,int b);
}
public class LambdaExpressionExample {

	public static void main(String[] args) {
		
		Test t=(a,b) ->  {
			System.out.println(a);
			System.out.println(b);
			System.out.println(a+b);
			}; 
		t.test(10, 20);
		

		Test1 t1=new Test1() {
			
			@Override
			public int test(int a, int b) {
				
				return a+b;
			}
		};
		
		System.out.println(t1.test(20, 30));
	
	}

}
