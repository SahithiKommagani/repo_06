package Generic;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
	public abstract  void print();

}
class Bike extends Vehicle{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("This is Bike class");
	}
	
}
class Car extends Vehicle{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("This is Car Class");
	}
	
}
class Bullet extends Bike{
	public void show()
	
	{
		System.out.println("subclasss of bike class");
	}
	
}
 

	
	

