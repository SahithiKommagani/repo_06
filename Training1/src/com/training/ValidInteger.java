package com.training;
import java.util.*;
public class ValidInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		try
		{
			Integer.parseInt(s);
			System.out.println(s + " is a valid integer");
		}
		catch(Exception e)
		{
			System.out.println(s + " is not a valid integer");
		}
		

	}

}
