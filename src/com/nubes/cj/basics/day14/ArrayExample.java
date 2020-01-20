package com.nubes.cj.basics.day14;

public class ArrayExample {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
		}
		
		System.out.println("Reverse order processing .... of an array ");
		
		for(int i = arr.length-1 ; i >=0 ; i--) {
			System.out.println(arr[i]);
		}

	}
}
