package com.nubes.cj.basics.day36;

public class ExceptionDemo {

		public static void main(String[] args) {
			System.out.println("Start of main...");
			String data = "Nareen,Naresh,CV,Ramesh,Suresh";
			for(String name:data.split(",")) {
				try {
					System.out.println(name.substring(0, 3).toUpperCase());
				}catch (StringIndexOutOfBoundsException e) {
					System.out.println(e);
				}
			}
			System.out.println("End of the main...");
		}
}
