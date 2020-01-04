package com.nubes.cj.basics.day5;

import java.util.Scanner;

public class PrintNumber {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number:");
			int num1 = sc.nextInt();
			
			if(num1 < 0) {
				num1 = -num1;
			}
			
			System.out.println("Entered number is:"+num1);
			sc.close();
			
		}
}
