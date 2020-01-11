package com.nubes.cj.basics.day5;
import java.util.Scanner;

public class NumberExample {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number:");
			int num = sc.nextInt();
			
			if(num > 0) {
				if( num > 100) {
					num = num * 3;
				}else {
					num = num * 2;
				}
			}else {
				num = -num * 2;
			}
			System.out.println(num);
			sc.close();
		}
}
