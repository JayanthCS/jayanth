package com.xworkz.inheritance.thing;

public class Camera extends Device {

	private String name;

	public Camera() {
		System.out.println("no-arg const in Camera");
	}

	public void electronic(String name) {
		this.name = name;
		System.out.println(this.name);
	}

}
