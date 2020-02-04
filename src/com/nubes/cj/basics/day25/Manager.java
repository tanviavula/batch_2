package com.nubes.cj.basics.day25;

import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of students:");
		int n = sc.nextInt();
		Student[] students = new Student[n];

		for (int i = 0; i < students.length; i++) {
			System.out.println("Enter the "+(i+1)+" student details:");
			System.out.println("Enter the regno:");
			int regno = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the student name:");
			String name = sc.nextLine();

			int scores[] = new int[3];
			for (int j = 0; j < scores.length; j++) {
				System.out.println("Enter the subject " + (j + 1) + " score ");
				int score = sc.nextInt();
				scores[j] = score;
			}
			Student s = new Student(regno, name, scores);
			students[i] = s;
		}

		System.out.println("-----------------------Student Results----------------");
		for(Student s:students) {
			System.out.println("-----------------------");
			s.showResult();
			System.out.println("-----------------------");
		}
		sc.close();
	}
}
