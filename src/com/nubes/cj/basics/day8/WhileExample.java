package com.nubes.cj.basics.day8;
import java.util.Scanner;
// This program will print numbers from 1 to 10
public class WhileExample {
	
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number value:");
			int num = sc.nextInt();
			int i = 1;
			while(i <= num) {
				System.out.println(i);
				i++;
			}
			sc.close();

	}
}
