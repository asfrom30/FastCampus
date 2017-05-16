package com.doyoon.java.week2.lecture.city.hospital;

import java.util.ArrayList;

import com.doyoon.java.week2.lecture.city.design.Building;

public class Hospital extends Building {
	
	ArrayList<Doctor> doctorList;
	ArrayList<Nurs> nursList;
	ArrayList<Patient> patientList;
	
	public Hospital() {
		this.doctorList = new ArrayList<>();
		this.nursList = new ArrayList<>();
		this.patientList = new ArrayList<>();
	}
	
	public ArrayList<Doctor> getDoctorList() {
		return doctorList;
	}
	
	public ArrayList<Patient> getPatientList() {
		return patientList;
	}
	
	public ArrayList<Nurs> getNursList() {
		return nursList;
	}
	
	
}
