package com.doyoon.java.week1.quiz1;

public class QuizLogic {
	
	
	
	public int calculate(int n, int m){
		
		int result = 0;
		
		for(int i=1; i <= n; i++){
			result += this.getCount(i, m);
//			System.out.println("number is " + i + ", count is "  + this.getCount(i, m) );
		}
		
		return result;
	}
	
	public int getCount(int number, int index){
		
		int result = 0;
		
		String strNumber = number + "";
		String strIndex = index + "";
		
		while(strNumber.length() > 0){
			
			// strIndex의 위치를 받는다.
			int position = strNumber.indexOf(strIndex);
			
			// 위치가 없으면 strNumber를 ""로 만든다.
			if(position == -1){
				strNumber = "";
			} else {
				result++;
				strNumber = strNumber.substring(position+1, strNumber.length());
			}
		}
		
//		strNumber.matches(regex)// 자바 정규식 사용
				
		return result;
		
	}
	
}
