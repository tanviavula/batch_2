package com.nubes.cj.basics.day6;

public class PrintNTables {
	
		public static void main(String[] args) {
		
			for(int j = 1; j <= 20; j++) {
				
				int num = j;
				for(int i=1;i<=10;i++) {
					System.out.println(num +" * "+ " = "+(num * i));
				}
				System.out.println("-------------------");
			}
			
			System.out.println("------------------------------------------------------");
			
			
			for(int i = 1; i <= 5; i++) {
				for(int j = 1; j <= i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
}
