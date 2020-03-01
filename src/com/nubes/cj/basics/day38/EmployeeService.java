package com.nubes.cj.basics.day38;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class EmployeeService {

	private Employee empArr[];
	private static EmployeeService obj;
	private EmployeeService() {
		File f = new File("employee.txt");
		try {
			List<String> list = Files.readAllLines(f.toPath());
			empArr = new Employee[list.size()];
			int count = 0;
			for (String data : list) {
				if (data.length() != 0) {
					String[] arr = data.split(",");
					int empno = Integer.parseInt(arr[0]);
					String ename = arr[1];
					int age = Integer.parseInt(arr[2]);
					Employee emp = new Employee(empno, ename, age);
					empArr[count++] = emp;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static EmployeeService getInstance() {
		if(obj == null) {
			obj = new EmployeeService();
		}
		return obj;
	}
	public float getAverageAge() {
		float avgAge = 0;
		int sum = 0;
		for (Employee emp : empArr) {
			sum += emp.getAge();
		}
		avgAge = sum / empArr.length;
		return avgAge;
	}

	public Employee maxAge() {
		return null;
	}

	public Employee minAge() {
		return null;
	}
}
