package com.nubes.cj.basics.day36;

import java.util.Scanner;

public class Manager {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the country code:");
			String countryCode = sc.nextLine();
			Country country = CurrencyContainer.getCountry(countryCode);
			System.out.println(country.getCurrency());
			sc.close();
		
	}
}
