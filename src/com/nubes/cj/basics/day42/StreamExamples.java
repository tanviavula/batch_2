package com.nubes.cj.basics.day42;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

// Functional interface : If an interface contains single abstract method is called fucntion interface
// Lambda



public class StreamExamples {

		public static void main(String[] args) {
			List<String> list = new ArrayList<>();
			list.add("Charan");
			list.add("Ramana");
			list.add("Krishna");
			list.add("Sai");
			list.add("Mahesh");
			list.add("Nareen");
			list.add("Amala");
			list.add("Kalyan");
			
			for(String name:list) {
				if(name.startsWith("K")) {
					System.out.println(name);
				}
			}

			list.stream()
			    .filter(ele -> ele.startsWith("K"))
			    .forEach(System.out::println);
			
			list.sort((e2,e1)->e1.compareTo(e2));
			System.out.println(list);
			
			
		}
}
