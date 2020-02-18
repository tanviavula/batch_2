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
		for (Question q : quiz.getQuestions()) {
			System.out.println(q.getQdata());
			System.out.println("A." + q.getOption1());
			System.out.println("B." + q.getOption2());
			System.out.println("C." + q.getOption3());
			System.out.println("D." + q.getOption4());
			System.out.println("Enter your answer:");

			userAnswers[c] = sc.nextLine();
			answers[c] = q.getAnswer();
			c++;
		}
		int ccount = 0;
		int wcount = 0;
		for (int i = 0; i < answers.length; i++) {
			if (answers[i].equalsIgnoreCase(userAnswers[i])) {
				ccount++;
			} else {
				wcount++;
			}
		}
		System.out.println("Total question: " + quiz.getQCount());
		System.out.println("No of correct: " + ccount);
		System.out.println("No fo wrongs: " + wcount);

	}

	private static Quiz createAndGetQuiz() {

		String data = "Who won the IPL final 2019?=Chennai Super Kings,Kolkata Knight Riders,Mumbai Indians,Royal Challengers Bangalore,C-How many times has India won the ICC World Cup?=2,1,4,3,A-Who got FIFA Best Player 2019 Award?=Neymar,Messi,Ronaldo,Luka Mordic,B";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title of Quiz:");
		String title = sc.nextLine();
		Quiz quiz = new Quiz(title);

		String questions[] = data.split("-");
//		for (String s : questions) {
//
//		}
//
//		for (int i = 0; i < quiz.getQuestions().length; i++) {
//
//			System.out.println("Enter the question " + (i + 1) + " Details :");
//			System.out.println("Enter the Question :");
//			String qdata = sc.nextLine();
//			System.out.println("Enter the option1:");
//			String option1 = sc.nextLine();
//
//			System.out.println("Enter the option2:");
//			String option2 = sc.nextLine();
//
//			System.out.println("Enter the option3:");
//			String option3 = sc.nextLine();
//
//			System.out.println("Enter the option4:");
//			String option4 = sc.nextLine();
//
//			System.out.println("Enter the Answer:(A,B,C,D)");
//			String answer = sc.nextLine();
//			Question question = new Question(qdata, option1, option2, option3, option4, answer);
//			quiz.getQuestions()[i] = question;
//
//		}

		for (int i = 0; i < quiz.getQuestions().length; i++) {
			String ques = questions[i];
			String arr[] = ques.split("=");
			String qdata = arr[0];
			String options[] = arr[1].split(",");
			String option1 = options[0];
			String option2 = options[1];
			String option3 = options[2];
			String option4 = options[3];
			String answer = options[4];
			Question question = new Question(qdata, option1, option2, option3, option4, answer);
			quiz.getQuestions()[i] = question;
		}
		return quiz;
	}
}
