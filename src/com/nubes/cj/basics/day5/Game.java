package com.nubes.cj.basics.day5;

import java.util.Scanner;

public class Game {
	
		public static void main(String[] args) {
			
		
			int num = (int)Math.ceil(Math.random()*6); // Logic to generate random number 1-6 range
			Scanner sc = new Scanner(System.in);
			System.out.println("Guess a number in range 1-6:5");
			int gnum = sc.nextInt();
			
			if(num == gnum) {
				System.out.println("Great you guessed....");
			}else {
				System.out.println("Sorry! try again");
				System.out.println("Actual number is :"+num);
			}
			sc.close();
			
		}
}
