package com.nubes.cj.basics.day20;

public class Employee {

		private int empno;
		private String name;
		private float salary;
		
		public Employee(int empno,String name,float salary) {
			this.empno = empno;
			this.name = name;
			this.salary = salary;
		}
		public Employee(int empno,String name) {
			this.empno = empno;
			this.name = name;
			this.salary = 30000;
		}
		
		public void increment(int percentage) {
			this.salary += (this.salary * percentage) / 100;
			
		}
		
		public void showInfo() {
			System.out.println(String.format("%d %s %f",empno,name,salary));
		}

		public int getEmpno() {
			return empno;
		}

		public String getName() {
			return name;
		}

		public float getSalary() {
			return salary;
		}
		
		
}
