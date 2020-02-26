package com.nubes.cj.basics.day36;

public class CurrencyContainer {
	private CurrencyContainer() {
		
	}
	
	public static Country getCountry(String country) {
		if(country.equals("IND")) {
			return new India();
		}else if(country.equals("UK")) {
			return new UK();
		}else if(country.equals("US")) {
			return new USA();
		}
		throw new IllegalArgumentException("Country name is not found");
	}
}
