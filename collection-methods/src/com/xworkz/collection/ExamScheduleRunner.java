package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class ExamScheduleRunner {

	public static void main(String[] args) {
		
		Collection<String> exam= new ArrayList<>();
		
		exam.add("Maths");
		exam.add("Chemistry");
		exam.add("Bio");
		exam.add("Phisics");
		exam.add("English");
		exam.add("Kannada");
		exam.add("Hindi");
		exam.add("Sanskrith");
		exam.add("Polity");
		exam.add("Finance");
		exam.add(null);
		exam.add(null);
		
		System.out.println(exam.size());
		
		for(String exams:exam) {
			if(Objects.nonNull(exams)) {
				System.out.println(exams);
			}
		}
		
		Iterator<String> ex=exam.iterator();
		
		while(ex.hasNext()) {
		String obj=ex.next();
		System.out.println("element exist");
		if(Objects.isNull(obj)) {
			ex.remove();
		}
		}
		
		System.out.println(exam);
		System.out.println("size:"+exam.size());
		
	}
}
