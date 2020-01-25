package com.nubes.cj.basics.day19;
public class Manager {

		public static void main(String[] args) {
				Student stu_1 = new Student(1001,6,"Rajesh");
				Student stu_2 = new Student(1002,8,"Manoj");
				Student stu_3 = new Student(1008,6,"Ramesh");
				Student stu_4 = new Student(1010,7,"Suresh");
				Student stu_5 = new Student(1012,8,"Ramu");
				Student stu_6 = new Student(1034,8,"Tanvi");
				
				Student arr[] = {stu_1,stu_2,stu_3,stu_4,stu_5,stu_6};
				
				for(Student s:arr) {
					s.showInfo();
					System.out.println("-------------------");
				}
				
				// Print details of only section 6 students
				System.out.println("Section 6 Student Details:");
				for(Student s:arr) {
					if(s.section == 6) {
						System.out.println("-------------------");
						s.showInfo();
					}
				}
				
				// Promote 6 class students 7
				
				System.out.println("Promoting students 6 to 7");
				for(Student s:arr) {
					if(s.section == 6) {
						s.promote();
					}
				}
				
				for(Student s:arr) {
					s.showInfo();
					System.out.println("-------------------");
				}
				
				// Dipslay student whose name start with R and section 7
				System.out.println("Search 'R' and section 7");
				for(int i=0;i<arr.length;i++) {
						Student s = arr[i];
						if(s.name.startsWith("R") && s.section == 7) {
							s.showInfo();
						}
				}
				
				
				
		}
}
