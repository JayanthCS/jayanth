package com.xworkz.association.things;

public class Company {

	public String name;
	public String ceoName;
	public double since;
	public Adress adress;

	public Company(String name, String ceoName, double since) {
		this.name = name;
		this.ceoName = ceoName;
		this.since = since;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public void display() {
		System.out.println("Company details......");
		System.out.println(this.name);
		System.out.println(this.ceoName);
		System.out.println(this.since);
		if (this.adress != null) {
			this.adress.display();
		} else {
			System.err.println("this.adress is null.......");
		}
	}
}
