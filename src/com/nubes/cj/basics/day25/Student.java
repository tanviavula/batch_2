package com.nubes.cj.basics.day25;

public class Student {
	
		private int regno;
		private String name;
		private int subjectScores[];
		private int totalScore;
		private String result;
		private String grade;
		
		public Student(int regno,String name,int[] subjectScores) {
			this.regno = regno;
			this.name = name;
			this.subjectScores = subjectScores;
		
		}
		
		public void showResult() {
				totalScore = calTotalScore();
				result = getResult();
				grade = getGrade();
				System.out.println("Regno:"+regno);
				System.out.println("Name:"+name);
				System.out.println("Total:"+totalScore);
				System.out.println("Result:"+result);
				System.out.println("Grade:"+grade);
				
		}
		
		private int calTotalScore() {
			int total = 0;
			for(int score : subjectScores) {
				total += score;
			}
			return total;
		}
		private String getResult() {
			
			for(int score:subjectScores) {
				if(score < 35) {
					return "Fail";
				}
			}
			return "Pass";
		}
		
		private float getAverage() {
			int total = calTotalScore();
			int subCount = subjectScores.length;
			return total / (float)subCount;
		}
		
		// Average score > 90 "A" 60 to 90 "B" 35 to 60 "C" "FAIL"
		private String getGrade() {
			
			String result = getResult();
			float average = getAverage();
			if(result == "Pass") {
				if(average > 90 && average <= 100) {
					return "A";
				}else if(average >= 60 && average <= 90) {
					return "B";
				}else {
					return "C";
				}
			}
			
			return "Fail";

     	}
		
		
}
