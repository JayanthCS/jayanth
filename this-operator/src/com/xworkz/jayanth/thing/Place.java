package com.xworkz.jayanth.thing;

public class Place {

	
	public String name;
	public int population;
	public String district;
	public String state;
	public String country;
	
	
	public Place() {
		//super();
		System.out.println("Calling no-arg constructor");
	}
	
	public Place(String name) {
		this.name = name;
		System.out.println("Calling a const with parameter String");
	}
	
	public Place(int population,String district) {
        this.population = population;
        this.district = district;
       System.out.println("Calling a const with 2 parameters of int and String");
	}
	
	public Place(String state,String country,String district) {
		this.state = state;
		this.country = country;
		this.district = district;
		System.out.println("Calling a const with paramets String ,String and String");
	}
	
	public Place(String name, int population) {
		this(name);
		this.population = population;
		System.out.println("Calling a const with parameters String and int");
	}
	
	public Place(String name,int population,String state,String district, String country) {
		this(name,population);
		//this(name);
		//this.population = population;
		//this(state,country,district);
		this.state = state;
		this.district = district;
		this.country = country;
		System.out.println("Calling all the instance parameter in constructor");
	}
	
	public void intialise(String name,int population,String district,String state,String country) {
		
		this.name = name;
		this.population = population;
		this.district = district;
		this.state = state;
		this.country = country;
	}
	
	public void display() {
		
		//this.name ="Cheeranahalli";
		//this.population = 2000;
		//this.district = "Chikkamagaluru";
		//this.state = "Karnataka";
		//this.country = "India";
		
		
		System.out.println("Inside display()");
		System.out.println("Place name is :"+this.name);
		System.out.println("Population of place is :"+this.population);
		System.out.println("district :"+this.district);
		System.out.println("state :"+this.state);
		System.out.println("country :"+this.country);
		System.out.println("Outside dispaly()");
	}
}