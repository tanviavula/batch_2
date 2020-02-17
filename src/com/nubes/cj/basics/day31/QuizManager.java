package com.nubes.cj.basics.day31;

import java.util.Scanner;

public class QuizManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Quiz quiz = createAndGetQuiz();
		System.out.println("Your quiz starts now:.....\n");
		startQuizAndShowResult(quiz);
		System.out.println("Thank you ....");

	}

	private static void startQuizAndShowResult(Quiz quiz) {
		Scanner sc = new Scanner(System.in);
		String[] userAnswers = new String[quiz.getQCount()];
		String[] answers = new String[quiz.getQCount()];
		int c = 0;
		for(Question q:quiz.getQuestions()) {
			System.out.println(q.getQdata());
			System.out.println("A."+q.getOption1());
			System.out.println("B."+q.getOption2());
			System.out.println("C."+q.getOption3());
			System.out.println("D."+q.getOption4());
			System.out.println("Enter your answer:");
			
			userAnswers[c] = sc.nextLine();
			answers[c] = q.getAnswer();
			c++;
		}
		int ccount = 0;
		int wcount = 0;
		for(int i=0;i<answers.length;i++) {
			if(answers[i].equals(userAnswers[i])) {
				ccount++;
			}else {
				wcount++;
			}
		}
		System.out.println("Total question: "+quiz.getQCount());
		System.out.println("No of correct: "+ccount);
		System.out.println("No fo wrongs: "+wcount);
		
	}

	private static Quiz createAndGetQuiz() {
		
		String data = "1 + 2  = ?,23,34,3,6,C-1 + 2  = ?,23,34,3,6,C-1 + 2  = ?,23,34,3,6,C";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title of Quiz:");
		String title = sc.nextLine();
		Quiz quiz = new Quiz(title);
		for (int i = 0; i < quiz.getQuestions().length; i++) {
			System.out.println("Enter the question " + (i + 1) + " Details :");
			System.out.println("Enter the Question :");
			String qdata = sc.nextLine();
			System.out.println("Enter the option1:");
			String option1 = sc.nextLine();

			System.out.println("Enter the option2:");
			String option2 = sc.nextLine();

			System.out.println("Enter the option3:");
			String option3 = sc.nextLine();

			System.out.println("Enter the option4:");
			String option4 = sc.nextLine();

			System.out.println("Enter the Answer:(A,B,C,D)");
			String answer = sc.nextLine();
			Question question = new Question(qdata, option1, option2, option3, option4, answer);
			quiz.getQuestions()[i] = question;

		}
		return quiz;
	}
}
