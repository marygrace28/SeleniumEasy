package TestNG;

import org.testng.annotations.Test;

public class DrivingCar {

	@Test(priority = 0)
	//if dependsonmethods and enabled false is given then it wont work
	public void StarttheCar()
	{
		System.out.println("Starting the car");
	}
	
	@Test(priority = 1,dependsOnMethods ="StarttheCar" )
	public void Firstgear()
	{
		System.out.println("First Gear");
	}
	
	@Test(priority = 2)
	public void Secondgear()
	{
		System.out.println("Second Gear");
	}
	@Test(priority = 3)
	public void Thirdgear()
	{
		System.out.println("Third Gear");
	}
	@Test(priority = 4)
	public void Fourthgear()
	{
		System.out.println("Fourth Gear");
	}
	@Test(priority = 5)
	public void Reversegear()
	{
		System.out.println("Reverse Gear");
	}
	@Test(priority = 6,enabled = false)
	public void TurnonMusic()
	{
		System.out.println("Turn on the Music");
	}
	//same annotation it is alpahbetic order.
	//if u hard code then we can give the priority.
}
