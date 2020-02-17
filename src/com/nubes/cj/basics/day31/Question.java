package com.nubes.cj.basics.day31;

public class Question {
	
		private String qdata;
		private String option1;
		private String option2;
		private String option3;
		private String option4;
		private String answer;

		public Question(String qdata, String option1, String option2, String option3, String option4, String answer) {
			this.qdata = qdata;
			this.option1 = option1;
			this.option2 = option2;
			this.option3 = option3;
			this.option4 = option4;
			this.answer = answer;
		}

		public String getQdata() {
			return qdata;
		}

		public void setQdata(String qdata) {
			this.qdata = qdata;
		}

		public String getOption1() {
			return option1;
		}

		public void setOption1(String option1) {
			this.option1 = option1;
		}

		public String getOption2() {
			return option2;
		}

		public void setOption2(String option2) {
			this.option2 = option2;
		}

		public String getOption3() {
			return option3;
		}

		public void setOption3(String option3) {
			this.option3 = option3;
		}

		public String getOption4() {
			return option4;
		}

		public void setOption4(String option4) {
			this.option4 = option4;
		}

		public String getAnswer() {
			return answer;
		}

		public void setAnswer(String answer) {
			this.answer = answer;
		}
			
	
}
