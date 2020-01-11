package com.nubes.cj.basics.day4;

import java.util.Scanner;

public class MathOperators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num_1 value:");
		int num_1 = sc.nextInt();
		System.out.println("Enter the num_2 value:");
		int num_2 = sc.nextInt();
		
		int sum = num_1 + num_2;
		int sub = num_1 - num_2;
		int mul = num_1 * num_2;
		int div = num_1 / num_2;
		int mod = num_1 % num_2;
		
		System.out.println("The sum is :"+sum);
		System.out.println("The sub is :"+sub);
		System.out.println("The mul is :"+mul);
		System.out.println("The div is :"+div);
		System.out.println("The mod is :"+mod);
		sc.close();
	
	}
}
