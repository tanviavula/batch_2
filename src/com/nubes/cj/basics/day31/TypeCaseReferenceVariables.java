package com.nubes.cj.basics.day31;

class One {
	int num = 10;
	public void m1() {
		System.out.println("One m1");
	}
}

class Two extends One {
	int num = 20;
	public void m1() {
		System.out.println("Two m1");
	}
	public void m2() {
		System.out.println("Two m2");
	}
}

public class TypeCaseReferenceVariables {
	public static void main(String[] args) {
		One obj = new Two();
		Two ob = (Two)obj;
		System.out.println(ob.num);
		ob.m1();
		ob.m2();
		
	}
}
