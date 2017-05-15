package com.doyoon.java.week2.quiz1;

public class QuizLogic2 {
	
	public void calculate(int input){
		int arr[][] = new int[input][input];
		int number = input*input;
		
		int loopIndex = 0;
		while(number > 0){
			int loopLength = input-loopIndex*2;
			
			for(int i=0; i<2; i++){
				int posX=0;
				int posY=0;
				int direction = 1;
				if(i==0){
					posX = loopIndex;
					posY = loopIndex;
					direction = 1;
				} else {
					posX = input - loopIndex -1;
					posY = input - loopIndex -1;
					direction = -1;
				}
				
				for(int j=0; j<loopLength*2-1;j++){
					if(j<=loopLength){
						arr[posX+j*direction][posY] = number;	// X를 증가(감소)하고
					} else {
						arr[posX][posY+j*direction] = number; // y를 증가(감소)한다.
					}
					loopIndex += 1;
					number--;
					
				}
			}
		}
		
		
		for(int i=0; i < arr.length; i++){
			for(int j=0; j < arr[0].length; j++){
				System.out.printf("%s ",arr[i][j]);
			}
			System.out.println("");
		}
	}
}
	
	
//	for(int i=0; i<loopLength*2-1;i++){
//	if(i<=loopLength){
//		arr[posX+i][posY] = number;	// X를 증가(감소)하고
//	} else {
//		arr[posX][posY+i] = number; // y를 증가(감소)한다.
//	}
//	number--;
//}
//
//
//
//for(int i=0; i<loopLength*2-1;i++){
//	if(i<=loopLength){
//		arr[posX-i][posY] = number;	// X를 증가(감소)하고
//	} else {
//		arr[posX][posY-i] = number; // y를 증가(감소)한다.
//	}
//	number--;
//}

