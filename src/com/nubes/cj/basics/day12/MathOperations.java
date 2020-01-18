package com.nubes.cj.basics.day12;

public class MathOperations {

	// Find biggest

	public int biggest(int a, int b, int c) {
		return a > b && b > c ? a : b > c ? b : c;
	}

	// Reverse
	public int reverse(int num) {
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		return rev;
	}

	// Palindrome or not
	public boolean palindrome(int num) {
		return num == reverse(num);
	}

	public boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	public int countPrimes(int lb, int ub) {
		int count = 0;
		for (int i = lb; i <= ub; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	public int[] getPrimesInRange(int lb, int ub) {
		int arr[] = new int[countPrimes(lb, ub)];
		for (int i = lb, j = 0; i <= ub; i++) {
			if (isPrime(i)) {
				arr[j++] = i;
			}
		}
		return arr;
	}
	
	public int factorial(int num) {
		if(num == 0 || num == 1) {
			return 1;
		}
		return num * factorial(num - 1);
	
	}

}
