package com.nubes.cj.basics.day16;

public class StringConstruct {

	public static void main(String[] args) {
		String name_1 = "Krish";
		String name_2 = new String("Krish");
		String name_3 = new String("Krish");
		System.out.println(name_1 == name_2);
		System.out.println(name_2 == name_3);
		System.out.println(name_1 == name_3);
		System.out.println(name_1.equals(name_2));
		System.out.println(name_1.equals(name_3));
		System.out.println(name_2.equals(name_3));

	}
}
