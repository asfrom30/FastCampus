package com.doyoon.java.week2.lecture.polymorphism;

import java.net.SocketOptions;

public class PolyMain {

	public static void main(String[] args) {
		Father son = new Son();
		son.setName("doyoon");
		
		
		
		System.out.println(son.getName());
	}

}
