package com.xoworkz.constructor.boot;

import com.xoworkz.constructor.thing.Film;

public class FilmRunner {

	
	public static void main(String[] args) {
		
		Film ref = new Film();
		System.out.println(ref.movieName);
		System.out.println(ref.theaterName);
		System.out.println(ref.location);
		System.out.println(ref.screens);
		System.out.println(ref.price);
		
		
		// initialisation
		
	ref.movieName = "Kranthi";
	ref.theaterName = "Milana";
	ref.location ="Chikkamagaluru";
	ref.screens =4;
	ref.price = 120D;
		
	System.out.println(ref.movieName);
	System.out.println(ref.theaterName);
	System.out.println(ref.location);
	System.out.println(ref.screens);
	System.out.println(ref.price);
	}
}
