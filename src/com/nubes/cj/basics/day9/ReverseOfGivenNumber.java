package com.nubes.cj.basics.day9;

import java.util.Scanner;

public class ReverseOfGivenNumber {

		public static void main(String[] args) {
			System.out.println("Enter the number");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int rev = 0;
			while(num != 0) {
				int r = num % 10;
				rev = rev * 10 + r;
				num = num / 10;
			}
			System.out.println("Reversed value:"+rev);
			sc.close();
		}
}
