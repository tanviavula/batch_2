package com.nubes.cj.basics.day6;

import java.util.Scanner;

public class Factorial {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		
		int res = 1;
		/*
		 * for(int i = 2; i <= num; i++) { res *= i; // res = res * i; }
		 */
		for(int i = num; i >= 2; i--) {
			res *= i;
		}
		System.out.println("The factorial of "+num + " is "+res);
		sc.close();
		
	}
}
