package com.nubes.cj.basics.day25;
class Shape{
	static String color = "RED";
	static {
		System.out.println("Static Block-1");
	}
	public Shape() {
		System.out.println("Constructor");
	}
	{
		System.out.println("IIB-1");
	}
	
	static {
		System.out.println("Static Block-2");
	}
}

public class StaticAndInstanceBlock {
	public static void main(String[] args) {
	//	Shape s = new Shape();
		System.out.println(Shape.color);
		Shape circle = new Shape();
		
	}
}
