package com.nubes.cj.basics.day6;

public class BreakStatement {
	
	public static void main(String[] args) {
		int count = 100;

		for(int i=1; ;i++) {
		    System.out.print(i+" ");
			if(i == count) {
				break;
			}
			
		}
	}
}
