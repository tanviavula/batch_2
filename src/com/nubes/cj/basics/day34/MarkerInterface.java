package com.nubes.cj.basics.day34;


public class MarkerInterface {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person p = new Person("Nareen", 35);
		p.showDetails();
		p.incrementAge();
		p.showDetails();
		
		Person p1 = p.clone();
		p1.showDetails();
		
		p.incrementAge();
		
		p1.showDetails();
		p.showDetails();
	}
}
