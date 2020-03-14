package com.nubes.cj.basics.day44;

import java.util.ArrayList;

public class Innerclasses {

		public static void main(String[] args) {
			try {
				Class cls = Class.forName("com.nubes.cj.basics.day44.MyList");
				Class[] clsNames = cls.getDeclaredClasses();
				for(Class c:clsNames) {
					System.out.println(c);
				}
				System.out.println(cls.isInstance(new ArrayList()));
			}catch (Exception e) {
				System.out.println(e);
			}
		}
}
