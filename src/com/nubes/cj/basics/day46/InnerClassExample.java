package com.nubes.cj.basics.day46;

class One {
	private int x = 100;

	class Inner {
		private int y = 200;

		void show() {
			System.out.println("X = " + x);
			System.out.println("Y = " + y);
		}
	}
}

interface MathOperations {
	public int add(int a, int b);
}

class UserMath implements MathOperations {
	@Override
	public int add(int a, int b) {
		return a + b;
	}

}

public class InnerClassExample {
	public static void main(String[] args) {
//		MathOperations obj = new MathOperations() {
//			@Override
//			public int add(int a, int b) {
//				return a + b;
//			}
//		};
		
		MathOperations obj = (a,b)->a + b;
		System.out.println(obj.add(10, 20));
	}
}
