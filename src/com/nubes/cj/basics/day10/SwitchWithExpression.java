package com.nubes.cj.basics.day10;

public class SwitchWithExpression {

		public static void main(String[] args) {
			
			 	byte a = 127; 
			 	switch (a++) {
				case 5:
					System.out.println(5);
					break;
				default:
					System.out.println("None");
					break;
				case 127:
					System.out.println(a);
					break;
				case 6:
					System.out.println(6);
					break;
				
				}
			 	System.out.println(a);
			
		}
}
