package com.doyoon.java.week2.quiz1;

public class QuizMain {
	public static void main(String[] args) {
//		QuizLogic quizLogic = new QuizLogic();
//		quizLogic.calculate(8);
//		
		QuizLogic quizLogic2 = new QuizLogic();
		quizLogic2.calculate(8);
		
		Answer answer = new Answer();
		answer.printSnail(answer.makeSnail(5));
		answer.printSnail(answer.drawSnail(6));
		answer.printSnail(answer.makeSnail(7));
	}
}
