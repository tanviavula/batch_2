/**
 * Write a program to accept two numbers from the user, calculate the sum and display the same.
 */
package com.nubes.cj.basics.day3;

import java.util.Scanner;

public class SumOfTwoNumbers {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num1 value:");
			int num_1 = sc.nextInt();
			System.out.println("Enter the num2 value:");
			int num_2 = sc.nextInt();
			int sum = num_1 + num_2;
			System.out.println("The sum of "+num_1+" and "+num_2+" is "+sum);
			sc.close();
			
		}
}
