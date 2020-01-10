package com.nubes.cj.basics.day9;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int c_num = num;
		
		int sum = 0;
		while(num != 0) {
			int r = num % 10;
			sum = sum + r * r * r;
			num = num / 10;
		}
		
		if(c_num == sum) {
			System.out.println(c_num +" is Amstrong number");
		}else {
			System.out.println(c_num +" is not a Amstrong number");
		}
		sc.close();
	}
}
