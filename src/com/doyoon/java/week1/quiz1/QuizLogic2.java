package com.doyoon.java.week1.quiz1;

import java.util.ArrayList;

public class QuizLogic2 {

	public int calculate(int n, int m){
		
		int result = 0;
		
		for(int i=1; i <= n; i++){
			result += this.getCount(i, m);
//			System.out.println("number is " + i + ", count is "  + this.getCount(i, m) );
		}
		
		return result;
	}
	
	
	public int getCount(int number, int splitter){
		
		int result = 0;
		ArrayList<Integer> numberList = new ArrayList<>();
		
		String strNumber = number + "";
		
		while(strNumber.length() > 0){
			
			String aString = strNumber.substring(0, 1);
			numberList.add(Integer.parseInt(aString));	// number list에 넣는다.
			
			strNumber = strNumber.substring(1, strNumber.length());
		}
		
		
		
		for(int aNumber : numberList){
			if(aNumber == splitter){
				result++;
			}
		}
		
		return result;
		
	}
}
