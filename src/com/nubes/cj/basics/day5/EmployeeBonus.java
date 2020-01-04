package com.nubes.cj.basics.day5;

import java.util.Scanner;

public class EmployeeBonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary :");
		float salary = sc.nextFloat();
		float bonus = 0;
		if(salary<= 15000) {
			bonus = salary * 0.15f;
		}
		float net_salary = salary + bonus;
		System.out.println("Salary :"+salary);
		System.out.println("Bonus:"+bonus);
		System.out.println("Net_salary:"+net_salary);
		sc.close();
		
		
	}
}
