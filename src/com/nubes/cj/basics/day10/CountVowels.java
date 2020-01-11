package com.nubes.cj.basics.day10;

public class CountVowels {

	public static void main(String[] args) {
		String name = "Indu Shree";
		int v_count = 0;
		int c_count = 0;
		for (int i = 0; i < name.length(); i++) {
				char ch = name.charAt(i);
					switch (ch) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
					case 'A':
					case 'E':
					case 'I':
					case 'O':
					case 'U':
						v_count++;
						break;
	
					default:
						c_count++;
				}
				
		}
		System.out.println(name+" has vowels in it is :"+v_count);	

	}
}
