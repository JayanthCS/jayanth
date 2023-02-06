package com.xworkz.association.things;

public class Projector {

	public String name;
	public boolean projector;
	public int noOfProjectors;

	public void initialisation(String name, boolean projector, int noOfProjectors) {
		this.name = name;
		this.projector = projector;
		this.noOfProjectors = noOfProjectors;
	}

	public void show() {
		System.out.println(name);
		System.out.println(projector);
		System.out.println(noOfProjectors);
	}
}
