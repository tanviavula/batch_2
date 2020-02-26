package com.nubes.cj.basics.day36;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

		public static void main(String[] args) {
			File file = new File("dummy.txt");
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				br.lines().forEach(line->System.out.println(line));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("End of main");
		}
}
