package com.nubes.cj.basics.day11;

public class NumberOperations {

	public static int sumOfFirstNNumbers(int N) {
		int res = 1;
		for (int i = 2; i <= N; i++) {
			res += i;
		}
		return res;
	}

	public static boolean isPrime(int num) {
		if (num < 0)
			throw new IllegalArgumentException("Number can't be negative");

		if (num < 2) {
			return false;
		}
		boolean prime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}

	public static int countPrimesInRange(int lb, int ub) {
		int count = 0;
		for(int i=lb;i<=ub;i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	public static int factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Input value can not be < 0");
		}

		int res = 1;
		for (int i = 2; i <= n; i++) {
			res *= i;
		}
		return res;
	}
}
