package com.nubes.cj.basics.day7;

public class InnerForLoop {

		public static void main(String[] args) {
			int c = 1;
			int k = 1;
			for(int i=1;i<=5;i++) {
				k = c;
				for(int j=1;j<=5;j++) {
					System.out.print(k+" ");
					k = k + 5; 
				}
				c++;
				System.out.println();
			}
		}
}
