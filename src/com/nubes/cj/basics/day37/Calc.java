package com.nubes.cj.basics.day37;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1:");
		int num1 = sc.nextInt();
		System.out.println("Enter the number 2:");
		int num2 = sc.nextInt();

		int sum = num1 + num2;
		try {
			int div = num1 / num2;
			System.out.println("Div :" + div);
		}catch (Exception e) {
			System.out.println("While dividing :Number2 value can't be zero:"+e.getMessage());
		}
		int mul = Integer.MAX_VALUE * 2;
		int sub = (num1 > num2) ? num1 - num2 : num2 - num1;
		System.out.println("Sum :" + sum);
		System.out.println("Mul :" + mul);
		System.out.println("Sub :" + sub);
		sc.close();

	}

}
