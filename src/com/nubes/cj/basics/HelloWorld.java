package com.nubes.cj.basics;

public class HelloWorld {
	public static void main(String args[]) {
		System.out.println("Welcome to Java world");
		Integer a = new Integer(20);
		Integer b = new Integer(20);
		int c = 20;
		System.out.println(a == c);
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}
}
