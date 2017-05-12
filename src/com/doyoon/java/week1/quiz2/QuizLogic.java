package com.doyoon.java.week1.quiz2;

import java.util.Arrays;

public class QuizLogic {
	
	public boolean isAnagram(String n, String m){
		
		char arrN[] = n.toCharArray();
		char arrM[] = m.toCharArray();
		
		Arrays.sort(arrN);
		Arrays.sort(arrM);
		
		return new String(arrN).equals(new String(arrM));
		
	}
}
