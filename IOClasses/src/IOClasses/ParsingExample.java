package IOClasses;

import java.util.Scanner;

public class ParsingExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name :");
		String name=sc.nextLine();
		System.out.println("Enter your Address:");
		String address=sc.nextLine();
		System.out.println("enter your designation :");
		String designation=sc.nextLine();
		System.out.println("enter your experience :");
	     int experience=sc.nextInt();
	     System.out.printf("Hello ,%s Your Address %s\n Your Designation %s\n Your experience %d years old \n" ,name,address,designation,experience);
		
		
		

	}

}
