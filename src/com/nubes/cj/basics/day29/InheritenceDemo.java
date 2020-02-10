package com.nubes.cj.basics.day29;

class One{
	int a = 100;
	void m1() {
		System.out.println("One m1");
	}
}
class Two extends One{
	int b = 200;
	void m1() {
		System.out.println("Two m1");
	}
	void m1(int a) {
		System.out.println("Two of m1 with a");
	}
	void m2() {
		System.out.println("Two m2");
	}
}

public class InheritenceDemo {

		public static void main(String[] args) {
			
			Object obj = new Two();			
			
			if(obj instanceof Two) {
				Two ob = (Two)obj;
				ob.m1();
				ob.m2();
			}else if(obj instanceof One) {
				One o = (One)obj;
				o.m1();
			}
			
		
		
		}
		
}
