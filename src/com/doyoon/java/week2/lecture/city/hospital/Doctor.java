package com.doyoon.java.week2.lecture.city.hospital;

import com.doyoon.java.week2.lecture.city.design.People;

public class Doctor extends People {
	
	
	public void diagnosis(Patient patient){
		System.out.println(patient.getName() + "어떤 환자를 진찰합니다.");
	}
}
