package com.nubes.cj.basics.day5;

import java.util.Scanner;

public class ScoreGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the score:");
		int score = sc.nextInt();
		
		if(score >= 90 && score <= 100) {
			System.out.println("A+");
		}else if(score >= 70 && score <90) {
			System.out.println("A");
		}else if(score >= 50 && score < 70) {
			System.out.println("B");
		}else if(score >= 35 && score <50) {
			System.out.println("C");
		}else {
			System.out.println("Fail");
		}
		sc.close();
	}
}
