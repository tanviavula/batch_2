package com.nubes.cj.basics.day43;

import java.util.HashSet;
import java.util.Set;

public class Manager {

		public static void main(String[] args) {
			Set<Employee> set = new HashSet<>();
			
			Employee emp1 = new Employee(1001, "Krishna", 36);
			Employee emp2 = new Employee(1002, "Nareen", 37);
			Employee emp3 = new Employee(1001, "Krishna", 36);
		
			set.add(emp1);
			set.add(emp2);
			if(set.add(emp3)) {
				System.out.println("Not a duplicate");
			}else {
				System.out.println("It is duplicate object");
			}
			
			System.out.println(set.size());
		}
}
