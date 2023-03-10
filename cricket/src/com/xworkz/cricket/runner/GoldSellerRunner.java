package com.xworkz.cricket.runner;

import com.xworkz.cricket.GoldSeller;
import com.xworkz.cricket.implement.Abharana;
import com.xworkz.cricket.implement.DevendraSetu;
import com.xworkz.cricket.implement.Mahalaxmi;
import com.xworkz.cricket.implement.Malabar;
import com.xworkz.cricket.usage.Anitha;
import com.xworkz.cricket.usage.Bhairavi;
import com.xworkz.cricket.usage.Priyanka;
import com.xworkz.cricket.usage.Shruti;

public class GoldSellerRunner {
	public static void main(String[] args) {
		GoldSeller gold = new Mahalaxmi();

		Anitha anita = new Anitha(gold);
		anita.buyGold();
		System.out.println("   ");

		GoldSeller gold1 = new Malabar();

		Priyanka priyanka = new Priyanka(gold1);
		priyanka.purchaseGold();

		System.out.println("   ");
		GoldSeller gold2 = new DevendraSetu();

		Shruti shruti = new Shruti(gold2);
		shruti.chinnaTago();
		System.out.println("   ");
		GoldSeller gold3 = new Abharana();

		Bhairavi bhairavi = new Bhairavi(gold3);
		bhairavi.bangaraKaridi();
	}
}
