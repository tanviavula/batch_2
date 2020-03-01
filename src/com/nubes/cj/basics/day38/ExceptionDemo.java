package com.nubes.cj.basics.day38;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int res = a /b;
			System.out.println(res);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally block");
		}
		System.out.println("End of main method");
		
	}
}
