package com.xworkz.association1.thing;

public class SunRise {

	public String rise;
	public String set;
	public Sun sun;

	public SunRise() {
		System.out.println("Creating a no-arg constructor");
	}

	public SunRise(String rise, String set) {
		this.rise = rise;
		this.set = set;
		System.out.println("String,String constructor in SunRise");
	}

	public void init(String rise, String set) {
		this.rise = rise;
		this.set = set;
	}

	public void init(Sun sun) {
		this.sun = sun;
	}

	public void dispaly() {
		System.out.println("Inside display()");
		System.out.println("Sun rises in the :" + this.rise);
		System.out.println("Sun sets in the :" + this.set);
		if (this.sun != null) {
			this.sun.show();
		} else {
			System.out.println("this.sun is not pointing to any memory");
		}
		System.err.println("Outside display();");
	}
}
