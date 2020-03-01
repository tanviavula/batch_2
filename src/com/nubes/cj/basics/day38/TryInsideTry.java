package com.nubes.cj.basics.day38;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryInsideTry {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the age:");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name:");
			String name = sc.nextLine();

			try {
				String shortName = name.substring(0, 3);
				System.out.println("Short name :" + shortName);
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println("The given name is too short:" + e);
			}
			System.out.println(name);
			System.out.println(age);
		} catch (Exception e) {
			try {
				System.out.println("While reading input:" + e);
			} catch (Exception e1) {
				System.out.println("While writing exception into source :" + e1);
			}
		} finally {
			try {
				System.out.println("Close method ");
				sc.close();
			} catch (Exception e) {
				System.out.println("While closing resource: " + e);
			}
		}
		System.out.println("Main method");
	}
}
