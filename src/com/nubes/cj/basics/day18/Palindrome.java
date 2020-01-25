package com.nubes.cj.basics.day18;

public class Palindrome {
	public static void main(String[] args) {
		String name = "amma";
		String rname = new StringBuffer(name).reverse().toString();
		if(rname.equals(name)) {
			System.out.println(name +" is palindrome");
		}else {
			System.out.println(name +" is not a palindrom");
		}
	}
}
