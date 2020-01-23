package com.nubes.cj.basics.day16;

public class StringObjectCheck {
	public static void main(String[] args) {
		String name = "Krish";
		String fullName="Krishna T";
		name = name.concat("na T");
		System.out.println(name.equals(fullName));
		System.out.println(name == fullName);
	}
}
