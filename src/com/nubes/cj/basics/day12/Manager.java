package com.nubes.cj.basics.day12;

import java.util.Arrays;
import java.util.Scanner;

public class Manager {

		public static void main(String[] args) {
			MathOperations obj = new MathOperations();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the lower bound:");
			int lb = sc.nextInt();
			System.out.println("Enter the upper bound:");
			int ub = sc.nextInt();
			
			int count = obj.countPrimes(lb, ub);
			int primes[] = obj.getPrimesInRange(lb, ub);
			System.out.println(count);
			System.out.println(Arrays.toString(primes));
			sc.close();
			
		}
}
