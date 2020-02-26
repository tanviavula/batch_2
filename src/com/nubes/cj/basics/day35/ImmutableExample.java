package com.nubes.cj.basics.day35;

final class Employee {
	final String name;
	final float salary;
	public Employee(String name, float salary) {
		this.name = name;
		this.salary = salary;
	}
	public Employee incrementSalary(float amount) {
		return new Employee(name, this.salary+amount);
	}
	public void showDetails() {
		System.out.println(String.format("Name : %s and Salary : %.2f", name, salary));
	}
}

public class ImmutableExample {

	public static void main(String[] args) {
			
		Employee emp = new Employee("Nareen", 150000);
		emp.showDetails();
		Employee afterIncremnt = emp.incrementSalary(20000);
		afterIncremnt.showDetails();
		emp.showDetails();
	}
}
