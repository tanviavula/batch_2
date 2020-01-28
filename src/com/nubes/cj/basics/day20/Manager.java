package com.nubes.cj.basics.day20;

public class Manager {
	public static void main(String[] args) {

		Employee emp_1 = new Employee(1007, "Lakshman", 50000.0f);
		Employee emp_2 = new Employee(1008, "Krish", 80000.0f);
		Employee emp_3 = new Employee(1009, "Rajesh");
		
		Employee[] arr = { emp_1, emp_2, emp_3 }; // Adding elements to the Array
		
		float t_sal_b_inc = 0;
		
		for (Employee emp : arr) {
			t_sal_b_inc += emp.getSalary();
		}
		System.out.println("Total salary paid to the employees " + t_sal_b_inc);
		
		float t_sal_a_inc = 0;
		for (Employee emp : arr) {
			emp.increment(10); //Increment the salary
			t_sal_a_inc += emp.getSalary();
			emp.showInfo();
		}
		
		System.out.println("Total salary paid to the employees after inc :" + t_sal_a_inc);
	}

}
