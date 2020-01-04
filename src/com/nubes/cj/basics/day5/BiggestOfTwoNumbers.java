package com.nubes.cj.basics.day5;

import java.util.Scanner;

public class BiggestOfTwoNumbers {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num1:");
			int num1 = sc.nextInt();
			System.out.println("Enter the num2:");
			int num2 = sc.nextInt();
			
			if(num1 > num2) {
				System.out.println("Biggest is :"+num1);
			}else {
				System.out.println("Biggest is:"+num2);
			}
			sc.close();
			
			
			
		}
}
