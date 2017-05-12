package com.doyoon.java.week1.quiz1;

public class QuizMain {
	public static void main(String[] args) {
		
		/* Quiz : n이하의 숫자에서 m이라는 숫자가 몇개 들어 있는지 합산하세요 */
		/* 	예를들어 10000 이하의 숫자에서 8이라는 숫자가 몇개 있는지 세려면
		 * 	18에 8이 1개... 8808에 8이 3개 이런식으로 하나씩 모두세어서 합산 */
		
		// 첫번째 방법
		QuizLogic quizLogic = new QuizLogic();
		int result = quizLogic.calculate(10000, 8);
		System.out.println(result);
		
		// 두번째 방법
		QuizLogic2 quizLogic2 = new QuizLogic2();
		int result2 = quizLogic2.calculate(10000, 8);
		System.out.println(result2);
		
		
	}
}
