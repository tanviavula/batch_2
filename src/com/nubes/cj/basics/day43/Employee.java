package com.nubes.cj.basics.day43;

public class Employee {

		private int empno;
		private String ename;
		private int age;
		public Employee(int empno, String ename, int age) {
			super();
			this.empno = empno;
			this.ename = ename;
			this.age = age;
		}
		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + empno;
			result = prime * result + ((ename == null) ? 0 : ename.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (age != other.age)
				return false;
			if (empno != other.empno)
				return false;
			if (ename == null) {
				if (other.ename != null)
					return false;
			} else if (!ename.equals(other.ename))
				return false;
			return true;
		}
		
}
