package com.training;

public class Constructor {
 static int counter=0;
 //default constructor
Constructor()
{
	System.out.println("Creating new Object");
	
	System.out.println(counter);
	counter++;
}
//parameterized constructor
Constructor(String message)
{
	System.out.println(message + counter);
	counter++;
	System.out.println(counter);
	 
}
public static void main(String args[])
{
	//object creation
	Constructor c=new Constructor();
	Constructor c1=new Constructor("Hello Team ");
	
}
}
