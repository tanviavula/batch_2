package com.nubes.cj.basics.day7;

import java.util.Scanner;

public class DiceGame {
		public static void main(String[] args) {
			int num = (int)(Math.ceil(Math.random()* 6));
			Scanner sc = new Scanner(System.in);
			
			boolean flag = false;
			
			
			for(int i = 1; i <= 3; i++) {
				System.out.println("Guess a number in range 1-6:");
				int g_num = sc.nextInt();
				
				if(g_num == num) {
					System.out.println("You guessed number in :"+i+" attempts");
					flag = true;
					break;
				}else {
					System.out.println("Sorry! try once agin");
				}
			}
			
			if(!flag) {
				System.out.println("Sorry you couldn't guess nuber in 3 attempts: number is:"+num);
			}
			sc.close();
			
		}
}
