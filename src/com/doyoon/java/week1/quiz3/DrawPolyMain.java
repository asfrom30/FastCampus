package com.doyoon.java.week1.quiz3;

public class DrawPolyMain {

	public static void main(String[] args) {
		DrawPolyMain drawPolyMain = new DrawPolyMain();
		drawPolyMain.drawRect("A", 9);
		drawPolyMain.drawTriangle("A", 9);
		
		drawPolyMain.drawCase2("A", 9);
		drawPolyMain.drawCase3("A", 9);
		drawPolyMain.drawCase4("A", 9);
		drawPolyMain.drawCase5("A", 9);
		drawPolyMain.drawCase6("A", 5);
		drawPolyMain.drawCase7("A", 5);
		drawPolyMain.drawCase8("A", 5);
		drawPolyMain.drawCase9("A", 5);
		drawPolyMain.drawCase10("A", 5);
		drawPolyMain.drawCase11("A", 7);
	}
	
	// 입력받은 문자 한개를 가로 세로 개수를 지정해서 출력하시오
	
	public void drawRect(String mark, int count){
		for(int i=0; i<count; i++){
			for(int j=0; j<count; j++){
				System.out.print(mark);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// 난이도 1
	public void drawTriangle(String mark, int count){
		for(int i=0; i<count; i++){
			for(int j=0; j<=i; j++){
				System.out.print(mark);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// 난이도 2
	public void drawCase2(String mark, int count){
		for(int y=1; y<=count; y++){
			for(int x=1; x<=count; x++){
				if(x<=count-y){
					System.out.print(" ");
				} else {
					System.out.print(mark);
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// 난이도 3
	public void drawCase3(String mark, int count){
		int totalNum = 2*count + 1;
		for(int i=0; i<count; i++){
			
			int charNum = 2*i+1;
			int spaceNum = (totalNum - charNum)/2;
			
			for(int j=0; j<2*count+1; j++){
				
				if(j<spaceNum){
					System.out.print(" ");
				} else if(spaceNum <= j && j < spaceNum + charNum){
					System.out.print(mark);
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// 난이도 3.5
	public void drawCase4(String mark, int count){
		int totalNum = 2*count + 1;
		for(int i=0; i<count; i++){
			
			int charNum = 2*i+1;
			int spaceNum = (totalNum - charNum)/2;
			
			for(int j=0; j<2*count+1; j++){
				
				if(j<spaceNum){
					System.out.print(" ");
				} else if(spaceNum <= j && j < spaceNum + charNum){
					if(spaceNum == j || j == spaceNum + charNum -1){
						System.out.print(mark);
					} else {
						System.out.print(" ");
					}
					
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	// 난이도 3.6
	public void drawCase5(String mark, int count){
		int maxCharNumInLine = 2*(count-1) + 1;
		for(int i=0; i<count; i++){
			
			int charNumInLine = 2*i+1;
			int spaceNum = (maxCharNumInLine - charNumInLine)/2;
			
			for(int j=0; j<maxCharNumInLine; j++){
				if(i == count-1){
					System.out.print(mark);
				} else {
					if(j<spaceNum){
						System.out.print(" ");
					} else if(spaceNum <= j && j < spaceNum + charNumInLine){
						if(spaceNum == j || j == spaceNum + charNumInLine -1){
							System.out.print(mark);
						} else {
							System.out.print(" ");
						}
						
					}
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	//난이도 3.8
	public void drawCase6(String mark, int count){
		
		System.out.println("Level 3.8");
		
		int maxLineNum = 2*(count-1) + 1;
		int maxCharNumInLine = 2*(count-1) + 1;

		for(int i=1; i<=maxLineNum; i++){
			
			
			int spaceNum = Math.abs(count - i);
			int charNumInLine = maxCharNumInLine - 2*spaceNum;
			
			for(int si=0; si < spaceNum; si++){
				System.out.print(" ");
			}
			for(int ci=0; ci < charNumInLine; ci++){
				System.out.print(mark);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// 난이도 4
	public void drawCase7(String mark, int count){
		
		System.out.println("Level 4");
		
		int maxLineNum = 2*(count-1) + 1;
		int maxCharNumInLine = 2*(count-1) + 1;

		for(int i=1; i<=maxLineNum; i++){
			
			
			int spaceNum = Math.abs(count - i);
			int charNumInLine = maxCharNumInLine - 2*spaceNum;
			
			for(int si=0; si < spaceNum; si++){
				System.out.print(" ");
			}
			for(int ci=0; ci < charNumInLine; ci++){
				// 이부분만 작성하면 된다.
				if(i<=count){
					if(ci%2 == 0){
						System.out.print(mark);
					} else {
						System.out.print(" ");
					}
				} else {
					System.out.print(mark);
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// 난이도 5
	public void drawCase8(String mark, int count){
		
		System.out.println("Level 3.8");
		
		int maxLineNum = 2*(count-1) + 1;
		int maxCharNumInLine = 2*(count-1) + 1;

		for(int i=1; i<=maxLineNum; i++){
			
			
			int spaceNum = Math.abs(count - i);
			int charNumInLine = maxCharNumInLine - 2*spaceNum;
			
			for(int si=0; si < spaceNum; si++){
				System.out.print(" ");
			}
			for(int ci=0; ci < charNumInLine; ci++){
				if(ci == 0 || ci == charNumInLine-1){
					System.out.print(mark);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	// 난이도 5.5
	public void drawCase9(String mark, int count){
		
		System.out.println("Level 5.5");
		
		int maxLineNum = 2*(count-1) + 1;
		int maxCharNumInLine = 2*(count-1) + 1;

		for(int i=1; i<=maxLineNum; i++){
			
			int spaceNum = count -1 - Math.abs(count - i);
			int charNumInLine = maxCharNumInLine - 2*spaceNum;
			
			for(int si=0; si < spaceNum; si++){
				System.out.print(" ");
			}
			for(int ci=0; ci < charNumInLine; ci++){
				// 이부분만 작성하면 된다.
				if(ci == 0 || ci == charNumInLine-1){
					System.out.print(mark);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// 난이도 5.7
	public void drawCase10(String mark, int count){
		
		System.out.println("Level 5.7");
		
		int maxLineNum = 2*(count-1) + 1;
		int maxCharNumInLine = 2*(count-1) + 1;

		for(int i=1; i<=maxLineNum; i++){
			
			for(int j=0; j<maxCharNumInLine; j++){
				if(i==1 || i == maxLineNum ){
					System.out.print(mark);
				} else {
					if(j == 0 || j == maxCharNumInLine - 1){
						System.out.print(mark);
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// 난이도 6
	public void drawCase11(String mark, int count){
		
		System.out.println("Level 6");
		int maxSpaceBetweenChar = count -1;
		int maxCharNumInLine = maxSpaceBetweenChar*(count-1) + count;
		
		for(int i=1; i<=count; i++){
			
			int spaceBetweenChar = count-i;
			int markNum = count-i+1;
			int totalNum = markNum + spaceBetweenChar*(markNum-1);
			int frontSpace = (maxCharNumInLine - totalNum)/2;
			
			for(int fi=0; fi<frontSpace; fi++){
				System.out.print(" ");
			}
			
			for(int j=0; j < markNum; j++){
				System.out.print(mark);
				for(int si=0; si<spaceBetweenChar; si++){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// 난이도 7
	
	 
	
}
