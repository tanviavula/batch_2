package com.nubes.cj.basics.day13;

import java.util.Scanner;

public class ArraysExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students :");
		int n = sc.nextInt();

		int[] ageArr = new int[n];
		
		for (int i = 0; i < ageArr.length; i++) {
			System.out.println("Enter age of student :" + (i + 1) );
			ageArr[i] = sc.nextInt();
		}

		int sum_of_ages = 0;
		for (int i = 0; i < ageArr.length; i++) {
			sum_of_ages += ageArr[i];
		}
		float avg_age = sum_of_ages / (float)ageArr.length;
		
		System.out.println("Sum of ages: "+sum_of_ages);
		System.out.println("Average age :"+avg_age);
		sc.close();

	}
}
