package com.nubes.cj.basics.day14;

import java.util.Arrays;

public class CountEvenOdd {

	public static void main(String[] args) {
		int arr[] = getRandomIntegers();
		System.out.println(Arrays.toString(arr));
		printEvenOddCount(arr);
		printDivisableBy(arr, 7);
		printPrimes(arr);
	}

	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void printPrimes(int[] a) {
		System.out.print("\nPrime numbers:[ ");
		for (int i = 0; i < a.length; i++) {
			if (isPrime(a[i])) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.print("]");
	}

	public static void printDivisableBy(int[] a, int num) {
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % num == 0) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.print(" ]");
	}

	public static void printEvenOddCount(int[] a) {
		int ecount = 0, ocount = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				ecount++;
			} else {
				ocount++;
			}
		}
		System.out.println("Even count:" + ecount);
		System.out.println("Odd count:" + ocount);
	}

	public static int[] getRandomIntegers() {
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.ceil(Math.random() * 100));
		}
		return arr;
	}
}
