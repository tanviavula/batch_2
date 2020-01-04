package com.nubes.cj.basics.day3;

import java.util.Scanner;

/**
 * 
 * Program to accept name, gender, age , isworking, salary of the person and
 * display details
 *
 */
public class PersonInformation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		sc.nextLine(); // to skip \n Enter key
		System.out.println("Enter the gender");
		String gender = sc.nextLine();
		
		
		System.out.println("Is working:");
		boolean isworking = sc.nextBoolean();
	
		System.out.println("Enter the salary :");
		double salary = sc.nextDouble();
		
		
		System.out.println("Name:"+name);
		System.out.println("Gender:"+gender);
		System.out.println("Age :"+age);
		System.out.println("Is working:"+isworking);
		System.out.println("Salary :"+salary);
		sc.close();

	}
}
