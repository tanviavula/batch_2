package com.nubes.cj.basics.day10;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		System.out.println("Enter the one of the operators: +, -, *, /, %");
		Scanner sc = new Scanner(System.in);
		String operator = sc.nextLine();
		int res = 0;
		switch (operator) {
		case "+":
			res = num1 + num2;
			break;
		case "-":
			res = num1 - num2;
			break;
		case "*":
			res = num1 * num2;
			break;
		case "/":
			res = num1 / num2;
			break;
		case "%":
			res = num1 % num2;
			break;
		default:
			System.out.println("Entered wrong operator...");
		}

		System.out.println(num1 + " " + operator + " " + num2 + " = " + res);
		sc.close();
	}
}
