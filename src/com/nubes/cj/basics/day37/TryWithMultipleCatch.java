package com.nubes.cj.basics.day37;

import java.util.Scanner;

public class TryWithMultipleCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		try {
			String shortName = name.substring(0, 3);
			System.out.println("Name :" + name);
			System.out.println("Short name:" + shortName);
			char arr[] = shortName.toCharArray();
			for (int i = arr.length; i >= 0; i--) {
				System.out.println(arr[i]);
			}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Name is too short...." + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please check array size and index:" + e);
		} catch (Exception e) {
			System.out.println(e);

		}
		System.out.println("End of main method");
		sc.close();
	}
}
