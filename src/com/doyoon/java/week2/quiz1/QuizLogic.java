package com.doyoon.java.week2.quiz1;

public class QuizLogic {
	
	
	public void calculate(int input){
		int arr[][] = new int[input][input];
		
		int totalNum = input*input;
		int number = totalNum;
		
		for(int loopIndex = 0; input-loopIndex*2 > 0; loopIndex++){
			int loopLength = input-loopIndex*2;
			
			for(int i=0; i < loopLength; i++){
				int posX = loopIndex;
				int posY = loopIndex;
				arr[posY][posX+i]= number;
				number --;
			}
			
			for(int i=0; i < loopLength-2; i++){
				int posX = input - loopIndex -1;
				int posY = loopIndex+1;
				arr[posY+i][posX] = number;
				number --;
			}
			
			for(int i=0; i < loopLength; i++){
				int posX = input - loopIndex -1;
				int posY = input - loopIndex -1;
				if(number != 0){
					arr[posY][posX-i]  = number;
				}
				number --;
			}
			
			for(int i=0; i < loopLength-2; i++){
				int posX = loopIndex;
				int posY = input - loopIndex -2;
				arr[posY-i][posX]  = number;
				number --;
			}
		}
		
		for(int i=0; i < arr.length; i++){
			for(int j=0; j < arr[0].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
		
//		System.out.println("loopIndex:" + loopIndex + ", posX:" + (posX+ i) + ", posY :" + posY +", number:" + number);
	}
	

}
