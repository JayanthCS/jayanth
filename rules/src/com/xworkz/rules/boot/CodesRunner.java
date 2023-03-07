package com.xworkz.rules.boot;

import com.xworkz.rules.implementation.Codes;
import com.xworkz.rules.thing.CodingRule;

public class CodesRunner {
	public static void main(String[] args) {

		Codes code = new Codes();
		String safe = code.safe();
		System.out.println(safe);
		String secure = code.secure();
		System.out.println(secure);
		String reiable = code.reiable();
		System.out.println(reiable);
		boolean test = code.testable();
		System.out.println(test);
		boolean maintain = code.maintainable();
		System.out.println(maintain);
		String standard = code.standards();
		System.out.println(standard);
		boolean portable = code.portable();
		System.out.println(portable);
		boolean read = code.readable();
		System.out.println(read);
		String result = code.result();
		System.out.println(result);
		boolean easy = code.easy();
		System.out.println(easy);
		String string = code.toString();
		System.out.println(string);
		int hash = code.hashCode();
		System.out.println(hash);

		CodingRule rule = new Codes();
		String safe1 = rule.safe();
		System.out.println(safe1);
		String secure1 = rule.secure();
		System.out.println(secure1);
		String reiable1 = rule.reiable();
		System.out.println(reiable1);
		boolean test1 = rule.testable();
		System.out.println(test1);
		boolean maintain1 = rule.maintainable();
		System.out.println(maintain1);
		String standard1 = rule.standards();
		System.out.println(standard1);
		boolean portable1 = rule.portable();
		System.out.println(portable1);
		boolean read1 = rule.readable();
		System.out.println(read1);
		String result1 = rule.result();
		System.out.println(result1);
		boolean easy1 = rule.easy();
		System.out.println(easy1);
		String string1 = rule.toString();
		System.out.println(string1);
		int hash1 = rule.hashCode();
		System.out.println(hash1);
	}
}
