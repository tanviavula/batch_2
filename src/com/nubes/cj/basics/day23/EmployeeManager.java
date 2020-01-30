package com.nubes.cj.basics.day23;

public class EmployeeManager {

	public static void main(String[] args) {
		String data =
				"1001,Lakshman,45000,MCA,12-1002,Rajesh,55500,B.Tech,10-1003,Mahesh,87788,B.Tech,12"
						+ "-1004,Pradeep,87658,B.Tech,20-1005,Charan,35000,M.Tech,3-1006,Laxmi,87788,B.Tech,12"
						+ "-1007,Indu Shree,87658,B.Tech,20-1008,Charan Raj,35000,M.Tech,3";
		
		String[] dataArr = data.split("-");
		
		Employee[] employees = new Employee[dataArr.length];
		
		int i=0;
		for(String s:dataArr) {
			
			String arr[] = s.split(",");
			int empno = Integer.parseInt(arr[0]);
			String name = arr[1];
			float salary = Float.parseFloat(arr[2]);
			String qualification = arr[3];
			int yearsOfExp = Integer.parseInt(arr[4]);
			Employee emp = new Employee(empno, name, salary, qualification, yearsOfExp);
			employees[i++] = emp;
			
		}
		
		// Get get the maxsalary employee details
		showMaxSalaryEmployees(employees);
		showEmployeesByYearOfExp(employees,10);
	
	}

	
	// Method to find employees who are having more thea given exp
	private static void showEmployeesByYearOfExp(Employee[] employees, int exp) {
		System.out.println("Employees exp >= "+exp);
		for(Employee emp:employees) {
			if(emp.getYearsOfExp() >= exp) {
				emp.showInfo();
			}
		}
		
	}



	private static void showMaxSalaryEmployees(Employee[] employees) {
		float maxSal = maxSalary(employees);
		
		System.out.println("Max Salaried Employees :(Max : "+maxSal+ " )");
		
		for(Employee e:employees) {
			if(e.getSalary() == maxSal) {
				e.showInfo();
			}
		}
		
	}
	
	private static float maxSalary(Employee[] employees) {
			float maxSal = employees[0].getSalary();
			for(Employee e:employees) {
				if(maxSal < e.getSalary()) {
					maxSal = e.getSalary();
				}
			}
			return maxSal;
	}
	
	
}
