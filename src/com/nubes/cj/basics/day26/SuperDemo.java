package com.nubes.cj.basics.day26;

class A{
	int num;
	A(int num){
		this.num = num;
	}
	void m1() {
		System.out.println("A - M1");
	}
}
class B extends A{
	int num;
	B(int num){
		super(num);
		this.num = num * 9;
	}
	void m2() {
		System.out.println("B - M1");
		System.out.println("Num value:" +super.num);
		System.out.println("Num value:" +num);
	}
}
class C extends B{
	int num = 111;
	C(int n){
		super(n);
	}
	void m3() {
		System.out.println(num);
		System.out.println(super.num);
	}
}

public class SuperDemo {
	public static void main(String[] args) {
		B obj = new B(100);
		obj.m1();
		obj.m2();
	}

}
