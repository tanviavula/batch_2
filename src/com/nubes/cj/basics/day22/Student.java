package com.nubes.cj.basics.day22;

public class Student {
	static String schoolName="JSL";

	private static int count = 0;
	private int regno;
	private String name;
	private int std;
	
	public Student(int regno,String name,int std) {
		this.regno = regno;
		this.name = name;
		this.std = std;
		count++;
	}
	public void showInfo() {
		System.out.println(String.format("%d %s %d %s",regno,name,std,schoolName));
	}
	
	public static int getCount() {
		return count;
	}
	
}
