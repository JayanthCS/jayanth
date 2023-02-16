package com.xworkz.inheritance2.thing;

public class ChildTubeLight extends TubeLight {

	public ChildTubeLight() {
		System.out.println("no-arg constructor inChildTubeLight");
	}

	public void bright() {
		System.out.println("Running bright() in ChildTubeLight");
	}
}
