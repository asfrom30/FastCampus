package com.doyoon.java.week2.lecture;

public class Summary {

	public static void main(String[] args) {
		
		/* switch는 범위에는 쓸수 없고 케이스가 한정되어 있을때 사용한다. */
		
		/* 함수가 정의 될때 사용하면 parameter, 함수를 호출할때 사용하면 argument */
		
		/* 예외, 정의가 되어있으면 에러, 예외 정의가 되어 있지 않은것은 시스템 다운 */
		/* 정의된 에러, 정수를 0으로 나누는것, 배열의 index 벗어나는, 부적절한 형변환,  파일이 없을경우  */
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			/* 한번은 실행해야 하는 것.
			 * 외부자원을 사용했다면 자원해제
			웹프로그래밍에서는 다른 페이지로 이동*/
		}
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();	 // 명령어를 다른 쓰레드에서 처리한다. 자바는 또 다르다.
			System.out.println(e.toString());	// 명령어를 순차적으로(같은 쓰레드에서 처리한다.
		} finally {
			System.out.println("다섯번째 값..");
		}
		// 따라서 e.printStatckTrace를 쓰면 순차적이 아니라.
		// 다섯번째 값이 출력이 되고
		// 그 다음에 sysout이 출력이된다.
		
		// 만일 sysout으로 선언하면 순차적으로 sysout을 출력하고 다섯번째 값이라는게 출력된다.
		
		/* POJO */
		/* 클래스에 변수와 getter, setter만 정의 */
		
		/** 객체지향 **/
		/* 객체 지향 설계는 두가지로 나뉜다. 설계한다 -> 구현한다.
		 * 설계와 구현은 종종 같이 가긴 하지만, abstract와 interface만 가지고도 설계가 가능하다. 이 경우 구현단계에서 실제 코드를 짠다.
		 * 1년정도 시간이 지나면 구현하는 코드는 거의 다 비슷해지지만, 설계에서 어떻게 하느냐가 좋은 개발자로 간다.(디자인 패턴, MVP 따로 공부)
		 */
		 
		/* 설계를 하려면 이름을 카테고리화(추상화) 한다.*/
		/* 설계를 할때는 카테고리화 하는 것부터 만든다. */
		/* 클래스간 공통된 것이 떠오르면 그것이 카테고리(추상화)를 해야할 단계이다. */
		/* 머리에 떠오르지 않으면 상속 X */
		
		/* 잘된 설계들은 코드가 바뀌지 않는다. */
		/* 클래스를 작성하다가 이 클래스는 변하지 않겠다고 생각되면 abstract를 클래스 앞에 붙여 주면 된다. */
		/* 이러면 abstract 클래스를 상속받은 클래스들은 강제로 함수를 구현해야하므로.. abstract가 변하면, 상속받는 클래스들도 모두 변해야 하므로 일이 커진다. */
		
		/* lecture.city 안에 있는 클래스를 만들어보면서 상속에 대한 연습을 한다. */
		/* 예제를 따라하면서 느꼈겠지만, 어느정도 클래스들이 쌓이고 이것이 공통된 속성을 가지면 패키지를 만들어(패키지 이름은 클래스 이름으로) 한곳에 담는다. */
		/* hostpital 클래스를 만들고, 이 안에 의사, 간호사, 환자, 병실등의 클래스를 만들다가 클래스가 쌓이면 hospital 패키지를 만들어서 이 안에 넣는다. */
		/* 내부 클래스들은 다른 클래스로 부터 상속 받을수도 있따. 의사는 People에서, 병실은 Room에서 */
		/* Building 클래스나, People 클래스는 카테고리화 되어 있으므로 abstract를 붙인다. */
		
		/* 함수를 분리하는 예시 */
		/* 부모클래스 : processTotal(), 자식클래스 : processTotal(){}
		 * 이때 자식클래스에서 부모클래스 processTotal()에 있는 함수의 일부를 사용하고 싶으면,
		 * 새로 작성하는 것이 아니라 부모클래스의 processTotal()을 processPartA(), processPartB()로 쪼개사 참조한다.
		 * 즉,
		 * 부모클래스 : processPartA(), processPartB, 자식클래스 : processTotal(){ super.processPartA }
		 */
		
		/* 하위클래스로 계속해서 내려가면서 method이름을 구체화시킨다.
		 * 예를들어, object의 함수명은 notify(), toString()처럼 추상적인 개념이지만
		 * 밑에 내려가서 작성하는 함수명은 구체적이게 된다.(확정) notifyAllUser()
		 * Swift언어에서는 주어+동사+목적어 순으로 함수명을 작성하기도 한다. 함수명이 길어지기 때문에 하위단 클래스로 갈수록 해주면 좋다. */
		
		/* 실제로 객체지향 설계에서 가장 많이 쓰는 것은 abstract, interface이다. */
		/* 과거에는 extend를 엄격하게 제한했지만, 구현하는 개발자도 설계를 해야하는 상황이 오기 때문에 현재는 필요에 따라서 extend를 사용하기도 한다. */
		
		
		/* 상속(inheritance)는 C에서 파생된 개념이고, Java에서는 extend(확장)하는 개념이다 */
		/* 자식클래스를 메모리에 올리면, 부모클래스도 같이 메모리에 올라간다.*/
		
		/* 인터페이스에서는 abstract 예약어 생략 가능 */
		/* abstract에서는 abstract를 사용하면 추상메소드, 사용하지 않으면 구현메소드 */
		
		/** 다형성 **/
		/* 다형성의 개발자
		 * people > daughter를 상속했다면
		 * daughter는 부가적인 기능만 있는것이다. people에 관한 것은 people(상위객체)에 잘 정의가 되어 있다.
		 * 잘 정돈된 핵심 기능만 있으면 people을 움직이는데 daughter를 people처럼 움직이는데 무리가 없다.
		 * 그래서 100개의 함수가 많이 뜨는것보다 people로 다형성을 구성하여 적은 기능으로 선택하게 한다. */
		
		
	}
}
