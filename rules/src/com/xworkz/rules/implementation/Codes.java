package com.xworkz.rules.implementation;

import com.xworkz.rules.thing.CodingRule;

public class Codes implements CodingRule {

	@Override
	public String safe() {
		return "Codes should be safe";
	}

	@Override
	public String secure() {
		return "Codes should be secure";
	}

	@Override
	public String reiable() {
		return "reiable";
	}

	@Override
	public boolean testable() {
		return true;
	}

	@Override
	public boolean maintainable() {
		return true;
	}

	@Override
	public String standards() {
		return "Maintane some standards";
	}

	@Override
	public boolean portable() {
		return true;
	}

	@Override
	public boolean readable() {
		return true;
	}

	@Override
	public String result() {
		return "Good Results";
	}

	@Override
	public boolean easy() {
		return false;
	}

	@Override
	public String toString() {
		return "safe: " + safe() + "secure:" + secure() + "reiable:" + reiable() + "testable:" + testable()
				+ "maintanable:" + maintainable() + "standards:" + standards() + "portable:" + portable() + "readable:"
				+ readable() + "resulats:" + result() + "isEasy:" + easy();
	}

	@Override
	public int hashCode() {
		return 300;
	}

}
