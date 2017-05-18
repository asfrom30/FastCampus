package com.doyoon.java.week2.lecture.polymorphism;

public class Son extends Father{
	
	private String name;
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
//		super.setName("son : " + name);
		// 부모 변수를 public
//		super.name = "s" + name;
		this.name = "new" + name;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
}
