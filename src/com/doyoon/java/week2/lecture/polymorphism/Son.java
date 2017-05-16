package com.doyoon.java.week2.lecture.polymorphism;

public class Son extends Father{
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName("son : " + name);
		
		// 부모 변수를 public
		super.name = "s" + name;
	}
}
