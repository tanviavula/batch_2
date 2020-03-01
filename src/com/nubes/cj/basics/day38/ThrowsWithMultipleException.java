package com.nubes.cj.basics.day38;

import java.util.Scanner;

public class ThrowsWithMultipleException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		try {
			Class cls = Class.forName(name);
			Object retObj = cls.newInstance();
			System.out.println(retObj.getClass().getSimpleName());
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
			System.out.println(e);
		}
		System.out.println("End of the maint method");
	}
}
