package com.xworkz.rules.boot;

import com.xworkz.rules.implementation.Patients;
import com.xworkz.rules.thing.HospitalRule;

public class PatientRunner {
public static void main(String[] args) {
	
	Patients p= new Patients();
	boolean icu=p.icuRoom();
	System.out.println(icu);
	double ambulance=p.ambulance();
	System.out.println(ambulance);
	String hygien=p.hygien();
	System.out.println(hygien);
	String noise=p.noise();
	System.out.println(noise);
	String parking=p.parking();
	System.out.println(parking);
	int opentime=p.openTime();
	System.out.println(opentime);
	int visit=p.visitingTime();
	System.out.println(visit);
	String string=p.toString();
	System.out.println(string);
	int hash=p.hashCode();
	System.out.println(hash);
	
	
	HospitalRule rule=new Patients();
	boolean icu1=rule.icuRoom();
	System.out.println(icu1);
	double ambulance1=rule.ambulance();
	System.out.println(ambulance1);
	String hygien1=rule.hygien();
	System.out.println(hygien1);
	String noise1=rule.noise();
	System.out.println(noise1);
	String parking1=rule.parking();
	System.out.println(parking1);
	int opentime1=rule.openTime();
	System.out.println(opentime1);
	int visit1=rule.visitingTime();
	System.out.println(visit1);
	String string1=rule.toString();
	System.out.println(string1);
	int hash1=rule.hashCode();
	System.out.println(hash1);
}
}
