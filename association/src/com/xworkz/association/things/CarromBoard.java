package com.xworkz.association.things;

public class CarromBoard {

	public String name;
	public int price;
	public boolean isCarromBoard;

	public void initialisation(String name, int price, boolean isCarromBoard) {
		this.name = name;
		this.price = price;
		this.isCarromBoard = isCarromBoard;
	}

	public void show() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(isCarromBoard);
	}
}
