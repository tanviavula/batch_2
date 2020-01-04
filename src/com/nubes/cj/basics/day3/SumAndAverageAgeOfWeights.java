package com.nubes.cj.basics.day3;

import java.util.Scanner;

/*
 *   Write a program to accept the weight of 3 persons, calculate the total weight, determine the average weight and display these details.
 */
public class SumAndAverageAgeOfWeights {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight of first person:");
		float p_weight_1 = sc.nextFloat();
		System.out.println("Enter the weight of second person:");
		float p_weight_2 = sc.nextFloat();
		System.out.println("Enter the weight of third person:");
		float p_weight_3 = sc.nextFloat();

		float sum_of_weights = p_weight_1 + p_weight_2 + p_weight_3;
		float avg_weight = sum_of_weights / 3;

		System.out.println("The sum of weight of the 3 persons is " + sum_of_weights + " Kgs");
		System.out.println("The average of weight of the 3 person is :" + avg_weight + " Kgs");
		sc.close();

	}

}
