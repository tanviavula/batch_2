package com.nubes.cj.basics.day19;
public class Student{
	
	int regno;
	int section;
	String name;
	
	
	public Student(int regno,int section, String name){
		this.regno = regno;
		this.section = section;
		this.name = name;
	}
	void promote() {
		section = section + 1;
	}
	void showInfo() {
		System.out.println("Regno :"+regno+"\nName :"+name+"\nSection:"+section);
	}
}