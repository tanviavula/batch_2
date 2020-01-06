package com.nubes.cj.basics.day6;

import java.util.Scanner;

public class FactorsOf3InTheRange {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the lower bound: ");
			int lb = sc.nextInt();
			System.out.println("Enter the upper bound: ");
			int ub = sc.nextInt();
			
			for(int i = lb; i <= ub; i++) {
				if(i % 3 == 0) {
					System.out.println(i);
				}
			}
			sc.close();
		}
}
