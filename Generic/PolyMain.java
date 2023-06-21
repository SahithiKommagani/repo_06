package Generic;

import java.util.ArrayList;
import java.util.List;

public class PolyMain {
	//creating a method that accepts only child class of Vehicle (Bike ,Car) 
		public static void getVehicleType(List<? extends Vehicle> lists){  
		for(Vehicle v:lists){  
		v.print();//calling method of Vehicle class by child class instance  
		}  
		}  
		//creating method that accepts only super class of bullet -bike
		public static void getVehicleType1(List<? super Bullet> l){  
			for(Object v:l){  
			((Vehicle) v).print();//calling method of Vehicle class by child class instance  
			}  
			}  
		public static void main(String args[]){  
		List<Bike> list1=new ArrayList<Bike>();  
		list1.add(new Bike());  
		  
		List<Car> list2=new ArrayList<Car>();  
		list2.add(new Car());  
		list2.add(new Car());  
		  
		getVehicleType(list1);
		getVehicleType(list2);
		List<Bike> list3=new ArrayList<Bike>();  
		list3.add(new Bike());  
		  
		List<Car> list4=new ArrayList<Car>();  
		list4.add(new Car());  
		list4.add(new Car()); 
		getVehicleType1(list3);
		//getVehicleType1(list4); //throws errors because car is not super type of bullet
		
		
		}}  

