package com.nubes.cj.basics.day23;

public class Employee {
	
	private int empno;
	private String name;
	private float salary;
	private String qualification;
	private int yearsOfExp;
	
	public Employee(int empno, String name, float salary, String qualification, int yearsOfExp) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.qualification = qualification;
		this.yearsOfExp = yearsOfExp;
	}
	public void showInfo() {
		System.out.println(String.format("%d %s %f %s %d",empno,name,salary,qualification,yearsOfExp));
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getYearsOfExp() {
		return yearsOfExp;
	}
	public void setYearsOfExp(int yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}
	
	
	
	
}
