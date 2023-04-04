package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Tester {
	public static void main(String[] args) {
		ArrayList<Byte> floors = new ArrayList<>();
		byte b1 = 1;
		byte b2 = 3;
		byte b3 = 4;
		byte b4 = 5;
		byte b5 = 6;
		byte b6 = 7;
		byte b7 = 9;
		byte b8 = 11;
		byte b9 = 12;
		byte b10 = 20;
		floors.add(b1);
		floors.add(b2);
		floors.add(b3);
		floors.add(b4);
		floors.add(b5);
		floors.add(b6);
		floors.add(b7);
		floors.add(b8);
		floors.add(b9);
		floors.add(b10);
		int total = floors.size();
		System.out.println("total added elements in byte:" + total);

		floors.clear();
		System.out.println("clear:" + floors.size());

		Collection<Short> age = new ArrayList<>();
		short a = 50;
		short b = 25;
		short c = 32;
		short d = 22;
		short e = 12;
		short f = 3;
		short g = 8;
		short h = 59;
		short i = 42;
		short j = 15;
		age.add(a);
		age.add(b);
		age.add(c);
		age.add(d);
		age.add(e);
		age.add(f);
		age.add(g);
		age.add(h);
		age.add(i);
		age.add(j);
		int total1 = age.size();
		System.out.println("Total added elements in short:" + total1);

		age.clear();
		System.out.println("Clear:" + age.size());

		Collection<Integer> pinCode = new ArrayList<>();
		pinCode.add(577449);
		pinCode.add(577101);
		pinCode.add(577102);
		pinCode.add(631251);
		pinCode.add(781524);
		pinCode.add(652331);
		pinCode.add(423761);
		pinCode.add(987543);
		pinCode.add(543281);
		pinCode.add(656342);

		int total2 = pinCode.size();
		System.out.println("Total added elements in integer:" + total2);
		pinCode.clear();
		System.out.println("Clear:" + pinCode.size());

		Collection<Long> phoneNum = new LinkedList<>();
		phoneNum.add(9611746564l);
		phoneNum.add(6364123100l);
		phoneNum.add(6364123101l);
		phoneNum.add(98765498765l);
		phoneNum.add(8105932128l);
		phoneNum.add(7654326565l);
		phoneNum.add(87654322345l);
		phoneNum.add(7654323457l);
		phoneNum.add(8567765221l);
		phoneNum.add(76298734876l);

		int total3 = phoneNum.size();
		System.out.println("Total added elements in long:" + total3);
		phoneNum.clear();
		System.out.println("Clear:" + phoneNum.size());

		Collection<Float> height = new LinkedList<>();
		height.add(4.7f);
		height.add(5.1f);
		height.add(4.8f);
		height.add(6.1f);
		height.add(5.8f);
		height.add(4.5f);
		height.add(4.0f);
		height.add(5.7f);
		height.add(5.2f);
		height.add(5.6f);

		int total4 = height.size();
		System.out.println("Total added elements in float:" + total4);
		height.clear();
		System.out.println("Clear:" + height.size());

		Collection<Double> salary = new LinkedList<>();
		salary.add(80000d);
		salary.add(20000d);
		salary.add(65000d);
		salary.add(34000d);
		salary.add(98000d);
		salary.add(61000d);
		salary.add(35000d);
		salary.add(45000d);
		salary.add(25000d);
		salary.add(18500d);

		int total5 = salary.size();
		System.out.println("Total added elements in double:" + total5);
		salary.clear();
		System.out.println("Clear:" + salary.size());

		Collection<Boolean> person = new ArrayList<>();
		person.add(true);
		person.add(false);
		person.add(true);
		person.add(false);
		person.add(true);
		person.add(false);
		person.add(true);
		person.add(false);
		person.add(true);
		person.add(false);

		int total6 = person.size();
		System.out.println("Total added elements in boolean:" + total6);
		person.clear();
		System.out.println("Clear:" + person.size());

		Collection<Character> nameChar = new ArrayList<>();
		nameChar.add('e');
		nameChar.add('f');
		nameChar.add('z');
		nameChar.add('c');
		nameChar.add('b');
		nameChar.add('s');
		nameChar.add('h');
		nameChar.add('u');
		nameChar.add('o');
		nameChar.add('p');

		int total7 = nameChar.size();
		System.out.println("Total added elements in char:" + total7);
		nameChar.clear();
		System.out.println("Clear:" + nameChar.size());

		Collection<String> names = new ArrayList<>();
		names.add("Jayanth");
		names.add("Abhishek");
		names.add("Shanthappa");
		names.add("Uma");
		names.add("Ambruth");
		names.add("Chandan");
		names.add("Revanth");
		names.add("Aruna");
		names.add("Darshan");
		names.add("Dinakar");

		int total8 = names.size();
		System.out.println("Total added elements in char:" + total8);
		names.clear();
		System.out.println("Clear:" + names.size());

	}
}
