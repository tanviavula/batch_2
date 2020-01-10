package com.nubes.cj.basics.day9;

import java.util.Scanner;

public class CheckPalindrome {
		public static void main(String[] args) {
			System.out.println("Enter the number:");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int temp = num;
			int rev = 0;
			while(temp != 0) {
				int r = temp % 10;
				rev = rev * 10 + r;
				temp = temp / 10;
			}
			
			if(rev == num) {
				System.out.println(num +" is palindrome");
			}else {
				System.out.println(num +" is not a palindrome");
			}
			
			sc.close();
		}
}
