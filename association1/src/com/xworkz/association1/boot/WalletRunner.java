package com.xworkz.association1.boot;

import com.xworkz.association1.thing.Money;
import com.xworkz.association1.thing.Wallet;

public class WalletRunner {

	public static void main(String[] args) {
		System.out.println("Inside main method");
		Wallet wallet = new Wallet("Levis", 999);
		wallet.display();
		Money money = new Money("paper", 500);
		wallet.init(money);
		wallet.display();
		System.out.println("Outside main method");
	}
}
