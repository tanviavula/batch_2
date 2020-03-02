package com.nubes.cj.basics.day39;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

		public static void main(String[] args) {
			List<Integer> list = new ArrayList<>();
			list.add(1001);
			list.add(1002);
			list.add(1003);
			list.add(1004);
			list.add(1005);
			list.add(1006);
			list.add(1001);
			System.out.println(list);
			list.remove(new Integer(1001));
			System.out.println(list);
			
			list.add(1, 999);
			System.out.println(list);
		}
}
