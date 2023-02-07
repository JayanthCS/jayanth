package com.xworkz.association1.thing;

public class Gift {

	public String name;
	public String type;
	public Box box;

	public Gift() {
		System.out.println("Creating no-arg constructor");
	}

	public Gift(String name, String type) {
		this.name = name;
		this.type = type;
		System.out.println("String,String constructor in Gift");
	}

	public void init(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public void init(Box box) {
		this.box = box;
	}

	public void display() {
		System.out.println("display() started");
		System.out.println(this.name);
		System.out.println(this.type);
		if (this.box != null) {
			this.box.display();
		} else {
			System.out.println("this.box is not pointing to any memory");
		}
		System.out.println("display() ended");
	}
}
