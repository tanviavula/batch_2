package com.nubes.cj.basics.day42;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

interface Itr{
	void show();
}
class Abc{
	String message;
	Itr itr() {
		return new Temp();
	}
	
	class Temp implements Itr{

		@Override
		public void show() {
			System.out.println(message);
			
		}
		
	}
}
public class SetExample {
	public static void main(String[] args) {
		Set<Integer> set =  new HashSet<>();
		set.add(1001);
		set.add(1002);
		set.add(1003);
		set.add(1005);
		set.add(1003);
		set.add(1004);
		set.add(null);
		set.add(null);
		
	// Hashcode() # Equals()  # Enum 
	// Map
		
//		for(Integer num:set) {
//			System.out.println(num);
//		}
//		Iterator<Integer> iterator = set.iterator();
//		while(iterator.hasNext()) {
//			Integer num = iterator.next();
//			System.out.println(num);
//		}
		set.stream().forEach(e->System.out.println(e));
	}
}
