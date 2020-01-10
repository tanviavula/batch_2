package com.nubes.cj.basics.day9;

public class PrintTable {

		public static void main(String[] args) {
			int num = 17;
			int i = 1;
			do {
				System.out.println(num+" * "+ i+" = "+(num * i));
				i++;
			}while(i <= 10);
		}
}
