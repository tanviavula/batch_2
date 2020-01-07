package com.nubes.cj.basics.day7;

public class PatternProgram2 {
	public static void main(String[] args) {
		
			for(int i=1;i<=4;i++) {
				for(int k = 1; k <= 4 - i;k++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				System.out.println();
			}
	}
}
