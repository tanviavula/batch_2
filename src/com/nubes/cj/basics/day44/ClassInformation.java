package com.nubes.cj.basics.day44;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Example {
	
	public void display() {
		System.out.println("The Display Method");
	}

	public void show(int a, int b) {
		System.out.println("The Show Method");
	}

	private void print(Object object) {
		System.out.println("The Print Method");
	}
}

public class ClassInformation {

		public static void main(String[] args) {
			try {
				Class cls = Class.forName("com.nubes.cj.basics.day44.Example");
				Method[] methods = cls.getDeclaredMethods();
				for(Method m:methods) {
					System.out.println(Modifier.toString(m.getModifiers()));
					System.out.println(m.getReturnType());
					System.out.println(m.getParameterCount());
					System.out.println(m.getName());
					System.out.println("--------------------------");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
}
