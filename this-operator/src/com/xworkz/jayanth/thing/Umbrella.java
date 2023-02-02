package com.xworkz.jayanth.thing;

public class Umbrella {

	public String type;
	public String material;
	public String size;
	public String color;
	public String brand;
	public double price;
	public int noOfPanels;
	public float durability;
	public boolean waterResistant;
	public boolean uvProtection;
	
	
	public Umbrella(String type,String material,String size, String color,String brand,double price,int noOfPanels, float durability, boolean waterResistant, boolean uvProtection) {
		
		this.type = type;
		this.material = material;
		this.size =size;
		this.color = color;
		this.brand = brand;
		this.price = price;
		this.noOfPanels = noOfPanels;
		this.durability = durability;
		this.waterResistant = waterResistant;
		this.uvProtection = uvProtection;
		
	}
         
	      public void display() {
	    	  
	    	  System.out.println("Inside display method");
	    	  System.out.println("Umbrella type is :"+this.type);
	    	  System.out.println("Material used is :"+this.material);
	    	  System.out.println("Umbrella size is :"+this.size); 
	    	  System.out.println("color is :"+this.color);
	    	  System.out.println("brand is :"+this.brand);
	    	  System.out.println("price is :"+this.price);
	    	  System.out.println("Total pannels are :"+this.noOfPanels);
	    	  System.out.println("durability :"+this.durability);
	    	  System.out.println("isWaterResistent :"+this.waterResistant);
	    	  System.out.println("isUVProtection :"+this.uvProtection);
	    	  System.out.println("Outside display method");
	      }
}
