package com.nubes.cj.basics.day38;

public class Manager {
	public static void main(String[] args) {
			
		EmployeeService obj1 = EmployeeService.getInstance();
		System.out.println(obj1.getAverageAge());
		
		
	}
}
