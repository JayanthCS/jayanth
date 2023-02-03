package com.xworkz.jayanth.thing;

public class Adopter {

	   public String type;//Wall charger
	   public String suitableFor; //Mobile
	   public String brand; //Apple
	   public double price;
		public String modelName;// MHJD3HN/A
	   public String outputInterface; //C-type
	   
	   public Adopter() {
		   System.out.println("Creating no-arg constructor");
	   }
	   
	   public Adopter(String type) {
		   this.type = type;
		   System.out.println("Calling constructor with one parameter");
	   }
	   
	   public Adopter(String type ,String suitableFor) {
		   this.suitableFor = suitableFor;
		   System.out.println("Calling constructor with two parameter");
	   }
	   public Adopter(double price, String modelName, String outputInterface) {
		   this.price = price;
		   this.modelName = modelName;
		   this.outputInterface = outputInterface;
		   System.out.println("Calling constructor with 3 parameters those are double ,String and String ");
	   }
	   
	   public void initialise(String type,String suitableFor,String brand,double price,String modelName,String outputInterface) {
		   
		   this.type = type;
		   this.suitableFor = suitableFor;
		   this.brand = brand;
		   this.price = price;
		   this.modelName = modelName;
		   this.outputInterface =outputInterface;
		   
	   }
	   
	   public void display() {
		   
		   System.out.println("Inside display()");
		   System.out.println("Type :"+ this.type);
		   System.out.println("suitable for :"+ this.suitableFor);
		   System.out.println("brand :"+this.brand);
		   System.out.println("price is :"+this.price);
		   System.out.println("Model name is :"+this.modelName);
		   System.out.println("Out put interface is :"+this.outputInterface);
		   System.out.println("Outside display()");
	   }
}
