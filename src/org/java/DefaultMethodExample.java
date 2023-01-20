package org.java;
interface Vehicle
{
	
	abstract public String getBrand();
	public String speedUp();
	public String speedDown();
	
	default String applyBrake()
	{
		getModel();
		return "brake applied...";
	}
	
	
	static int getHorsePower(int rpm, int torque)
	{
		return (rpm * torque) / 5252;
	}
	
	private String getModel()
	{
		return "This is car model";
	}
	
	
}

 class Car implements Vehicle
{
	private final String brand;
	
	Car(String brand)
	{
		this.brand=brand;
	}
	
	@Override
	public String getBrand() {
		
		return this.brand;
	}

	@Override
	public String speedUp() {
		
		return "The car is speeding up..";
	}

	@Override
	public String speedDown() {
		
		return "The car is slowing down..";
	}
	
}


public class DefaultMethodExample {

	public static void main(String[] args) {
		
		Vehicle v=new Car("BMW"); 
		System.out.println(v.getBrand());
		System.out.println(v.speedUp());
		System.out.println(v.speedDown());
		System.out.println(v.applyBrake());
		System.out.println(Vehicle.getHorsePower(2500, 480));

		

	}

}
