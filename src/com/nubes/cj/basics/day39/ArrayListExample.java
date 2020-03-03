package com.nubes.cj.basics.day39;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

		public static void main(String[] args) {
			List<Integer> list = new ArrayList<>();
			
			list.add(1001); 
			list.add(1005);
			list.add(1006);
			list.add(1002);
			list.add(1001);
			
			for(int i=0;i<list.size();i++) {
				int ele = list.get(i);
				System.out.println(ele);
			}
			System.out.println("Using for each loop:");
			for(int i:list) {
				System.out.println(i);
			}
			System.out.println("By using stream...");
			list.forEach(e->System.out.println(e));
			
			// Add element in specific location
			System.out.println("Before add :"+list.size());
			list.add(3, 1003);
			System.out.println(list);
			System.out.println("Afer add :"+list.size());
		
			list.remove(3);
			System.out.println("After remove :"+list);
			
			list.remove(new Integer(1001));
			System.out.println("After remove :"+list);
			
			System.out.println(list.contains(1001));
			
			
		}
}
