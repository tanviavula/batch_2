package com.nubes.cj.basics.day10;

public class Offers {

	public static void main(String[] args) {

		float amount = 25000;
		// 1,2,3,4,5,6,7
		int day = 7;
		float discount = 0;
		switch (day) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				discount = amount * .02f;
				break;
			case 6:
			case 7:
				discount = amount * .01f;
				break;
			default:
				System.out.println("Day input was given wrong...");
		}
		System.out.println("Amount :"+amount);
		System.out.println("Discount:"+discount);
		System.out.println("Net amount:"+(amount-discount));

	}
}
