package com.nubes.cj.basics.day9;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int cnum = num;
		int sum = 0;
		while(num != 0) {
			int r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		System.out.println("The sum of digits of "+cnum+" is "+sum);
		sc.close();
				
	}
}
