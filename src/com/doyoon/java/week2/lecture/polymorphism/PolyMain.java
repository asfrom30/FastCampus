package com.doyoon.java.week2.lecture.polymorphism;

import java.net.SocketOptions;

public class PolyMain {

	/* 호출되는 함수가 어디에 있냐에 따라서, 접근하는 변수가 다르다. */
	/* Son에 오버라이드가 되어 있지 않으면 Father의 함수를 호출한다. */
	public static void main(String[] args) {
		Father son = new Son();
		son.setName("doyoon");
		
		/* Father에 담았지만, Son의 함수를 호출 한다. 오버라이드 되어 있지 않으면 부모의 함수를 호출 한다. */
		System.out.println(son.getName());
	}

}
