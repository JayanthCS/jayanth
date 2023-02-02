package com.xworkz.jayanth.thing;

public class Frame {

	public String material;
	public String color;
	public String shape;
	public String size;
	public String weight;
	public String style;
	public String finish;
	public String durability;
	public int price;
	public String brand;
	public String type;
	public int warranty;
	
	
	public Frame(String material,String color,String shape,String size,String weight,String style,String finish,String durability,int price, String brand,String type,int warranty) {
    
	this.material = material;
	this.color = color;
	this.shape = shape;
	this.size = size;
	this.weight = weight;
	this.style = style;
	this.finish = finish;
	this.durability = durability;
	this.price = price;
	this.brand = brand;
	this.type = type;
	this.warranty = warranty;
	}
	
	public void display() {
		
		System.out.println("Inside display()");
		System.out.println("Frame material is :"+this.material);
		System.out.println("Frame color is :"+this.color);
		System.out.println("Frame shape is :"+this.shape);
		System.out.println("Frame size is :"+this.size);
		System.out.println("Frame weight is :"+this.weight);
		System.out.println("Frame style is :"+this.style);
		System.out.println("Frame finish is :"+this.finish);
		System.out.println("Frame durability is :"+this.durability);
		System.out.println("Frame price is "+this.price);
		System.out.println("Frame brand is :"+this.brand);
		System.out.println("Frame type is :"+this.type);
		System.out.println("Warranty of frame in years :"+this.warranty);
		System.out.println("Outside main method");
	}
}

