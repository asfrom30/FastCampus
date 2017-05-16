package com.doyoon.java.week2.lecture.city.design;

public class People {
	private String name;
	private String gender;
	private int age;
	private String skinColor;
	private int height;
	private int weight;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void move(){
		System.out.println("움직입니다.");
	}
	
}
