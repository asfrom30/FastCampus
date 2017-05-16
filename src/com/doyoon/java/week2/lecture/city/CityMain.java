package com.doyoon.java.week2.lecture.city;

import com.doyoon.java.week2.lecture.city.hospital.Doctor;
import com.doyoon.java.week2.lecture.city.hospital.Hospital;
import com.doyoon.java.week2.lecture.city.hospital.Nurs;
import com.doyoon.java.week2.lecture.city.hospital.Patient;

public class CityMain {
	public static void main(String[] args) {
		
		
		Hospital hospital = new Hospital();
		
		for(int i=0; i<2; i++){
			Doctor doctor = new Doctor();
			hospital.getDoctorList().add(doctor);
		}
		
		for(int i=0; i<6; i++){
			Nurs nurs = new Nurs();
			hospital.getNursList().add(nurs);
		}
		
		for(int i=0; i<21; i++){
			Patient patient = new Patient();
			hospital.getPatientList().add(patient);
		}
		
		
		
	}
}
