package com.doyoon.java.week2.lecture.oop;

public abstract class Fix {
	
		// 추상클래스 = 인터페이스 + 클래스
	
		// MVP, 디자인 패턴을 보다보면 인터페이스가 왜 필요한지 알게 된다.
		// 지금은 인터페이스가 아무리 해도 이해가 안될 것이다.
		// 설계랑 구현이 계속 같이 간다.

		// 알고리즘에 관련된 코드는 추상클래스로 구현해서 반드시 사용한다.
		// 코드가 바뀌지 않기 때문이다.
		// 항상 순서대로 동작하는 경우 이럴때 추상클래스를 사용한다.
		
		// 기능이 구현되지 않은 함수를 사용해서 정형화 시킬수 있다.
		public void process(){
			disassemble();
			for(int i=0; i < 2; i++){	// 두번 고친다.
				replacePart();
			}
			clean();
			runLogic();
		}
		
		public void runLogic(){
			// 이 로직은 바뀌면 안되고 내부적으로만 써야되
			// this class에서 두번이상 사용 되는 함수를 정형화
		};
		
		// abstract로 하면 안에 구현하지 않아도 된다.
		public abstract void disassemble();
		public abstract void replacePart();
		public abstract void clean();
		
		// 상속은 커플링때문에 잘쓰지 않았는데, 현재는 필요에 따라 쓸 수 있다.
		// 1인 개발자들이 많아서, 설계랑 구현도 자기가 한다.
		// 큰 프로젝트에 들어가면 구현만 하지만, 설계도 가끔 하게 된다.
		// 상속은 설계하는 사람들이 쓰는것.
}
