package com.nubes.cj.basics.day45;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class One {
	public String fullName(String fname, String lname) {
		return fname.concat(" ").concat(lname);
	}
}

public class Manager {

	public static void main(String[] args) {

//		Properties properties = new Properties();
//		try {
//			properties.load(new FileInputStream("greetings.properties"));
//			Class cls = Class.forName((String) properties.get("cname"));
//
//			Object obj = cls.newInstance();
//			if (obj instanceof Greetings) {
//				Greetings g = (Greetings) obj;
//				System.out.println(g.message());
//			}
//
//		} catch (ClassNotFoundException | IOException | InstantiationException | IllegalAccessException e) {
//			e.printStackTrace();
//		}
		
		try {
			Class c=Class.forName("com.nubes.cj.basics.day45.One");
			Method m=c.getMethod("fullName", new Class[] {String.class,String.class});
			String fullName = (String)m.invoke(new One(), new Object[] {"Tanvi","A"});
			System.out.println(fullName);
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
