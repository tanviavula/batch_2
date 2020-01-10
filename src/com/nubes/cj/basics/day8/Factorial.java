package com.nubes.cj.basics.day8;

public class Factorial {

		public static void main(String[] args) {
			int num = 5;
			
			int res = 1;
		/*
		 * for(int i=2;i<=num;i++)
		 *  { 
		 *    res *= i;
		 * 
		 * }
		 */
			int i = 2;
			while(i <= num) {
				res *= i;
				i++;
			}
			System.out.println(res);
		}
}
