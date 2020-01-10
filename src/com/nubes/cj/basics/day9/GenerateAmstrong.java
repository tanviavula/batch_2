package com.nubes.cj.basics.day9;

public class GenerateAmstrong {
	public static void main(String[] args) {
		int i=1;
		int c = 0;
		while(true) {
			int num = i;
			int sum = 0;
			while(num != 0) {
				int r = num % 10;
				sum = sum + r * r * r;
				num = num / 10;
			}
			
			if(i == sum) {
				System.out.println(i);
				c++;
			}
			if(c == 5) {
				break;
			}
			i++;
			
		}
	
	}
}
