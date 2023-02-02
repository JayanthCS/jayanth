package com.xoworkz.constructor.boot;

import com.xoworkz.constructor.thing.Beer;

public class BeerRunner {

	public static void main(String[] args) {
		Beer beer = new Beer("Tuborg", "Tuborg Green", "Pilsner", 6.4f, 700, 36, 57, 0.6f, 6, 0, 0, 0, 15, 26, 0, 0, 5, 0, 0, 0, 36, 14, 9, 4, 45, 0, 0, 0);
		beer.display();
		
		Beer beer1 = new Beer("KingFisher", "Kingfisher Strong can", "Pilsner", 4.8f, 350, 36, 57, 0.6f, 6, 0, 0, 0, 15, 26, 0, 0, 5, 0, 0, 0, 36, 14, 9, 4, 45, 0, 0, 0);
		beer.display();
		beer1.display();
}
}
