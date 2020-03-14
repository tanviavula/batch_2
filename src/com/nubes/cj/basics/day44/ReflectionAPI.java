package com.nubes.cj.basics.day44;

import java.lang.reflect.Method;

class Employee{
	
	private int empno;
	private String ename;
	private double salary;

	public Employee() {
	}
	public Employee(int empno,String ename,double salary) {
		this.empno = empno;
		this.salary = salary;
		this.ename = ename;
	}
	public void showInfo() {
		double taxAmount = calTaxAmount();
		double netSal = salary - taxAmount;
		System.out.println(empno);
		System.out.println(ename);
		System.out.println(salary);
		System.out.println(netSal);
	}
	private double calTaxAmount() {
		return salary * 0.12;
	}
}

public class ReflectionAPI {
	
		public static void main(String[] args) {
			try {
				Class cls = Class.forName("com.nubes.cj.basics.day44.Employee");
				Method[] methods = cls.getMethods();
				for(Method m:methods) {
					System.out.println(m);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}
}
