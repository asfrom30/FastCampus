package com.doyoon.java.week1.quiz2;

public class QuizMain {
	
	public static void main(String[] args) {
		
		/* 문자열 구성이 같은 문자열을 anagram 이라고 한다. 예) abcd = acbd = cabd */
		/* 입력값을 문자열 n, m으로 받은 후, n문자열과 m 문자열이 아나그램인지 확인하는 프로그램을 작성하세요. */
		/* 결과값을 true로 리턴한다 */
		
		QuizLogic quizLogic = new QuizLogic();
		boolean result = quizLogic.isAnagram("abekc", "akcbe");
		
		System.out.println(result);
		
	}
}
