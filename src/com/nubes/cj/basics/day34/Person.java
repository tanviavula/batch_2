package com.nubes.cj.basics.day34;
public class Person implements Cloneable {
	String name;
	int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void incrementAge() {
		this.age = this.age + 1;
	}
	void showDetails() {
		System.out.println("Name :"+name+"\nAge :"+age);
	}
	@Override
	protected Person clone() throws CloneNotSupportedException {
		return (Person)super.clone();
	}
}