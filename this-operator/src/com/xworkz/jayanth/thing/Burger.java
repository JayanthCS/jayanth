package com.xworkz.jayanth.thing;

public class Burger {

	
	 public String name;
	    public boolean ingredients;
	    public float price;
	    public int size;
	    public int calories;
	    public float preparationTime;
	    public String type;
	    public boolean toppings;
	    public String sauce;
	    public String bun;
	    public String cheese;
	    public boolean lettuce;
	    public int tomato;
	    public int onion;
	    public int pickles;
	    
	    public Burger(String name,boolean ingredients,float price,int size,int calories,float preparationTime,String type,boolean toppings,String sauce,String bun,String cheese,boolean lettuce,int tomato,int onion,int pickles) {
	        this.name=name;
	        this.ingredients=ingredients;
	        this.price= price;
	        this.size=size;
	        this.calories=calories;
	        this.preparationTime=preparationTime;
	        this.type=type;
	        this.toppings=toppings;
	        this.sauce=sauce;
	        this.bun=bun;
	        this.cheese=cheese;
	        this.lettuce=lettuce;
	        this.tomato=tomato;
	        this.onion=onion;
	        this.pickles=pickles;
	        
	        	
	    }
	    public void display() {
	    	System.out.println("Inside display()");
	    	System.out.println("Burger name "+this.name);
	    	System.out.println("Burger ingredients "+this.ingredients);
	    	System.out.println("Burger price "+this.price);
	    	System.out.println("Burger size "+this.size + " inch");
	    	System.out.println("Burger calories "+this.calories);
	    	System.out.println("Burger preparationTime "+this.preparationTime+" hrs");
	    	System.out.println("Burger type "+this.type);
	    	System.out.println("Burger toppings "+this.toppings);
	    	System.out.println("Burger sauce "+this.sauce);
	    	System.out.println("Burger bun  "+this.bun);
	    	System.out.println("Burger cheese  "+this.cheese);
	    	System.out.println("Burger lettuce  "+this.lettuce);
	    	System.out.println("Burger tomato  "+this.tomato);
	    	System.out.println("Burger onion  "+this.onion);
	    	System.out.println("Burger pickles  "+this.pickles);
	    	System.out.println("Outsideside display()");
	    }
}
