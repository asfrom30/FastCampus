package com.doyoon.java.week1.lecture;

import java.util.ArrayList;

public class Summary {
	
	public Summary() {
		
		/* 패키지이름 = 도메인네임(거꾸로).java.이름*/
		
		/* variable -> identifier(식별자) */
		
		/* float & long */
		long longNumber = 12312941294L;	// postfix를 붙여준다. postfix가 겂으면 정수형으로 인식 경고
		float floatNumber = 123905123F;
		
		/* public static main을 Entry point라고 한다 */
		
		/* 스위프트에서는 상수를 소문자로도 쓴다. */
		/* 자바진영에서는 상수를 대문자로 쓴다. */
		
		/* Diffrence between handling process using For loop and Algorithm */
		/* For Loop(Sometimes for loop take a lot of time) */
		long start = 0;
		long end = 9999L;
		double result = 0;
		
		for(long i = start; i <= end; i++){
			result += i;
		}
		System.out.println(result);
		/* This is Algoritm */
		double result2 = (1+end)*((end+1)/2)-(end+1);
		System.out.println(result2);
		
		/* 부동소수점 연산은 함수형 객체를 사용해서 연산을 해준다. */
		/* 기본형에 대응 되는 객체 */
		/* 1번 방법 */
		Float temp_a=49239.2394F;
		Float temp_b=12374123F;
		temp_a.intValue();
		/* 2번 방법 */
		Float.sum(temp_a, temp_b);		
		
		/* If condition Short Circuit */
		/* 중요한 연산을 항상 앞에 두어야 한다.(코딩 스킬중 하나이다.), 연산속도가 줄어든다. */
		/* 즉 반복문 안의 코딩은 신중해야한다. */
		/* A가 false 이면 B는 연산하지 않는다. */
//		if(A && B){
//			
//		}
		
		/* 삼항 연산자도 결과값 연산은 할 수 있다. */
		int a = 4;
		int b = 5;
		
		int hi = a > b ? 1+1 : 1+3;
		System.out.println(hi);
		
		/* 숫자를 문자로 바꾸는 방법 */
		//String.valueOf(number);
		int number = 357;
		String str = number + "";
		
		/* Switch 문에서 break를 사용하지 않으면 조건에 걸린 구문 부터 아래로 모두 실행 되어 버린다. */
		int testInt = 35;
		switch (testInt) {
		case 35:
			System.out.println("a의 값은 35 입니다.");
			break;
		case 36: // 값이 36보다 큰 경우에 동일한 한수를 처리해아 할때는 이렇게 38 케이스에 한번만 처리하고 break를
					// 사용하지 않는다.
		case 37:
		case 38:
			System.out.println("a의 값은 35 입니다.");
			break;

		default:
			break;
		}
		
		/* Don't use array.length in for loop */
		/* 배열에서 길이값을 체크할때는 반복문에 바로 가져오지 않고 반드시 다른변수에 담아서 선언한다. */
		/* for문 안에 선언하면, for문을 돌다가 배열의 개수가 변하는 경우가 현업에서도 상당히 많이 생긴다. */
		int units[] = {5000, 1000, 500, 100, 50, 10};
		int units_length = units.length;
		
		for(int i=0; i<units_length; i++){
			
		}
		
		/* 전역변수(멤버변수)는 초기화 하지 않아도 초기화 되지만, 생성자에 명시해서 시점을 명확히 한다. */
		/* 지역변수는 초기화 하지 않으면 에러를 발생시킨다. */
		
		/* 값을 주고 받을때 return 배열이 상당히 빠르다. 객체나 컬렉션보다 훨씬 빠르다. */
		
		/* 부동소수점 연산은 직접 사용 하지 않는다. 클래스를 이용할 것 */
		
		/* 기능이 없고 변수만 나열되어 있는 클래스도 있다. (C에서는 이를 구조체라고 한다. */
		
		/* Java doc은 대형 프로젝트에서 공통 유틸 영역을 만드는 부서에서 발행하는 것, 다른 부서 사람들이 읽고 API를 사용 할 수 있도록, 다수의 사람들이 읽어야 하므로. */
		
		/* 자바는 Unicode를 사용 char = 2byte */
		
		/* Short + Short = Int라서 int형 변수에 넣으면 에러가 난다. */
		
		/* 객체지향 설계의 핵심은 Naming이다.
		 * Naming이 되지 않으면 코드의 가독성이 떨어지고, Debugging에 걸리는 시간도 늘어난다. 이름을 모두 바꿔야 하는 경우도 생김.
		 * 7H/8H 일 정도로 Naming에 많은 시간을 투자하기도 한다.
		 */
		
		/* 로직(대입 연산 포함)은 함수 밖에서 대부분은 선언하지 않는다.
		 * 가령 멤버변수의 경우 생성자 밖에서 명시하고 생성자에서 초기화(대입) */
		
		/* new를 선언하는 순간 JVM의 속도가 느려진다. 메모리 점유, static을 사용하면 계속 점유하는 메모리의 크기가 올라간다. */
		
		/* Collection 중 Set은 List와 동작 방식이 같지만 중복값을 허용하지 않는다. */
		
		/* String.substring(m,n)은 문자열 사이사이를 가르킨다. ex)안녕하세요 => ex)(0)안(1)녕(2) .... 요(5)  ()안은 인덱스 넘버  */
		
		/* String twoPart[] = name.split("하") split함수는 결과값을 문자열로 반환 */
		
		/* 접근 제한자를 쓰지 않으면 default고 default는 패키지에서만 접근이 가능하다.
		 * 나에게만 필요한 함수를 사용하겠다라고 하면 default 접근제한자  */
		
		/* 메모리 안에 Null을 위한 공간이 따로 있고 NullpointerException은 해당 identifier가 지금 NUll 영역을 가르킨다. */
		
		/* Java version 5부터  Boxing unboxing 자동으로 객체로 변환해서 담아준다.(arrayList.add(457) */
		
		/* Arraylist에서 향상된 for문을 쓰기. 단 generic이라는 예약어를 써야한다. generic을 사용하지 않으면 반환하는 값이 어떤타입인지 모르기 때문..
		*  제네릭은 결국 컬렉션에서 타입을 정의하기 위함이다. */
		ArrayList<Integer> fiboList = new ArrayList<>();	// 이게 제네릭이다(타입을 지정해주는 것) 제네릭은 컬렉션 객체에 많이 쓰고 
		ArrayList fiboList2 = new ArrayList();	// 제네릭을 사용하지 않으면 Object로 반환
		
	}
	
}
