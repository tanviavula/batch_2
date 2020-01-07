package com.nubes.cj.basics.day7;

public class SwapNumbers {

		public static void main(String[] args) {
			int a = 10;
			int b = 20;
			System.out.println("Before Swap A :"+a+"\nB :"+b);
		/*
		 * int temp = a; a = b; b = temp;
		 */
		/*
		 * a = a + b; // 30 b = a - b; // 10 a = a - b; // 20
		 */			
			a = a * b;
			b = a / b;
			a = a / b ; 
			System.out.println("After Swap A :"+a+"\nB :"+b);
		}
}
