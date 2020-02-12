package com.nubes.cj.basics.day30;

public class PassByValue {

	public static void main(String[] args) {
			int a = 10;
			int b = 20;
			swap(a, b);
			System.out.println("Value of a :"+a+" and b :"+b);
	}

	public static void swap(int a, int b) {
			System.out.println("Before swap a :"+a+" and b :"+b);
			a = a * b; 
			b = a / b; 
			a = a / b; 
			System.out.println("After swap a :"+a+" and b :"+b);
	}
	
	
}
