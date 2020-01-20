package com.nubes.cj.basics.day14;

public class BiggestAndSamllest {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 4, 2, 1, 7, 9, 8, 6, 5 };

		int big = arr[0];
		int small = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (big < arr[i]) {
				big = arr[i];
			}
			if (small > arr[i]) {
				small = arr[i];
			}
		}
		System.out.println("Biggest is :" + big);
		System.out.println("Smallest is : " + small);

	}
}
