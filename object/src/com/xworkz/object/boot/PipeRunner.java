package com.xworkz.object.boot;

import com.xworkz.object.thing.Pipe;

public class PipeRunner {

	public static void main(String[] args) {

		Pipe pipe = new Pipe();
		pipe.setBrand("Ashirwad");
		pipe.setLength(5);
		pipe.setDiameter(4);
		pipe.setColour("white");

		System.out.println(pipe);
		System.out.println(pipe.hashCode() + " original hashcode :" + System.identityHashCode(pipe));

		Pipe pipe1 = new Pipe();
		pipe1.setBrand("Finolex");
		pipe1.setLength(6);
		pipe1.setDiameter(3);
		pipe1.setColour("Gray");

		System.out.println(pipe1);
		System.out.println(pipe1.hashCode() + " original hashcode :" + System.identityHashCode(pipe1));

		System.out.println(pipe.equals(pipe1));

	}
}
