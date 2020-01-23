package com.nubes.cj.basics.day16;

public class ImmutableExample {

		public static void main(String[] args) {
			String data_1 = "Welcome to Java World";
			String data_2 = "Welcome to Java World";
			String data_3 = "Welcome to Java World";
			
			System.out.println(data_1 == data_2);
			System.out.println(data_2 == data_3);
			System.out.println(data_1 == data_3);
			
			System.out.println(data_1.equals(data_2));
			System.out.println(data_1.equals(data_3));
			System.out.println(data_2.equals(data_3));
			
			
			
		}
}
