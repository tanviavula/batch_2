package com.nubes.cj.basics.day6;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
	
		boolean isPrime = true;
		
		for(int i = 2; i <= num / 2; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("Given nubmer:"+num+" is a prime");
		}else {
			System.out.println("Given number: "+num+" is not a prime");
		}
		sc.close();		
	}
}
